package com.tugfeivecek.sayfalararasiveritasimagorselnesne

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugfeivecek.sayfalararasiveritasimagorselnesne.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGonder.setOnClickListener(){
            val alinanVeri = binding.editTextGirdi.text.toString()
            val intent=Intent(this@MainActivity,ActivityB::class.java)
            intent.putExtra("mesaj",alinanVeri)
            startActivity(intent)
        }
    }
}