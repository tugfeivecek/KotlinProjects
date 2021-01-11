package com.tugfeivecek.sharedpreferenceskullanimi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        //okuma ıslemı
        val sp = getSharedPreferences("KisiselBilgiler", Context.MODE_PRIVATE)

        //uygulama cokmesin diye isim yok yaziyoruz
        val ad = sp.getString("ad", "isim yok")
        val yas = sp.getInt("yas", 0)
        val boy = sp.getFloat("boy", 0.0f)
        val bekarMi = sp.getBoolean("bekarMi", false)

        //liste gelmezse null olsun
        val liste = sp.getStringSet("arkadasListesi", null)

        //verileri konsolda yazdirme
        Log.e("Ad", ad.toString())
        Log.e("Yaş", yas.toString())
        Log.e("Boy", boy.toString())
        Log.e("Bekar mı?", bekarMi.toString())

        //bu ıfade null değilse calıs
        if (liste != null) {
            for (a in liste) {
                Log.e("Arkadaş", a)
            }

        }
    }
}