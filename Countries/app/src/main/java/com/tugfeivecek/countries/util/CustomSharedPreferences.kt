package com.tugfeivecek.countries.util

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.preference.PreferenceManager

class CustomSharedPreferences {


    companion object {

        private val PREFERENCES_TIME = "preferences_time"
        private var sharedPreferences: SharedPreferences? = null

        @Volatile
        private var instance: CustomSharedPreferences? = null
        private val lock = Any()

        //instance var mı yok mu kontrol edelim
        operator fun invoke(context: Context): CustomSharedPreferences =
            instance ?: synchronized(lock) {
                instance ?: makeCustomSharedPreferences(context).also {
                    instance = it
                }
            }

        //customshrad.. dondurucek shared pr.olusturma
        private fun makeCustomSharedPreferences(context: Context): CustomSharedPreferences {
            //
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
            return CustomSharedPreferences()
        }


    }

    //zamani olusturma
    fun saveTime(time: Long) {
        //commit=true ne yaparsak yapalım calıstırıyo
        sharedPreferences?.edit(commit = true) {
            putLong(PREFERENCES_TIME, time)
        }
    }
    //bir sey kayıtlı degilse 0 gostersin
    fun getTime() = sharedPreferences?.getLong(PREFERENCES_TIME, 0)

}
