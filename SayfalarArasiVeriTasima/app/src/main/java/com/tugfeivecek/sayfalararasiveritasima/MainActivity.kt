package com.tugfeivecek.sayfalararasiveritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugfeivecek.sayfalararasiveritasima.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGonder.setOnClickListener(){
            val kisi =Kisiler(99999,"Ahmet",1.98)

            val intent= Intent(this@MainActivity,ActivityB::class.java)
            //sayfalar arası veri geçişi
            intent.putExtra("mesaj","Merhaba")
            intent.putExtra("yas",23)
            intent.putExtra("boy",1.80)

            // classtaki veriyi aktarma
            intent.putExtra("nesne",kisi)
            startActivity(intent)
        }
    }
}