package com.tugfeivecek.sharedpreferenceskullanimi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugfeivecek.sharedpreferenceskullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //dosya ismi kisiselbilgiler
        // modeprrivate bu dosyayı en son sil
        val sp = getSharedPreferences("KisiselBilgiler", Context.MODE_PRIVATE)
        // bu dosya icinde degisiklik yapma yetkisi
        val editor= sp.edit()

        // Silme islemleri
        editor.remove("ad")
        editor.commit()
        //kayıt yapma veri olusturma
       /* editor.putString("ad","Ahmet")
        editor.putInt("yas",18)
        editor.putFloat("boy",1.78f)
        editor.putBoolean("bekarMi",true)
        //bir veri birden fazla bulunamaz

        val arkadasListesi= HashSet<String>()
        arkadasListesi.add("Zeynep")
        arkadasListesi.add("Ece")
        arkadasListesi.add("Ali")

        editor.putStringSet("arkadasListesi",arkadasListesi)

        //kayıt ıslemı gerceklesmesi icin
        editor.commit()*/


        binding.buttonGiris.setOnClickListener {
            startActivity(Intent(this@MainActivity,ActivityB::class.java))
        }
    }
}