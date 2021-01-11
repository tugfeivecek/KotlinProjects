package com.tugfeivecek.sayacuygulamasi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugfeivecek.sayacuygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sp = getSharedPreferences("GirisSayici", Context.MODE_PRIVATE)
        var sayac =sp.getInt("sayac",0)

        // editleme düzenleme yetkisi
        val editor = sp.edit()
        editor.putInt("sayac",sayac++)
        editor.commit()

        binding.textViewSayac.text = "Açılış Sayısı : $sayac"
    }
}