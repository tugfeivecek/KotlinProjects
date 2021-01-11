package com.tugfeivecek.countries.service

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tugfeivecek.countries.model.Country
//ROOM icin

@Database(entities = arrayOf(Country::class),version = 1)
abstract class CountryDatabase : RoomDatabase() {

    //
    abstract fun countryDao() : CountryDao

    //Singleton
    //veritabanında tek bir obje olsun istiyoruz cakısma olmasın diye

    companion object {
        //volatile farkli treadlere gorunur hale getiriyor

        @Volatile private var instance : CountryDatabase? = null

        private val lock = Any()
//synchronizde aynı anda tek thread calısıcak
        operator fun invoke(context : Context) = instance ?: synchronized(lock) {

            instance ?: makeDatabase(context).also {
                instance = it
            }
        }

        //veritabanımızı olusturacagımız fonksyıon
        private fun makeDatabase(context : Context) = Room.databaseBuilder(
            context.applicationContext,CountryDatabase::class.java,"countrydatabase"
        ).build()
    }
}