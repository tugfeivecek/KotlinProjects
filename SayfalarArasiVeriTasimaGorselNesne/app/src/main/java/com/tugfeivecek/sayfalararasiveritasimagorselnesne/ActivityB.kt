package com.tugfeivecek.sayfalararasiveritasimagorselnesne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugfeivecek.sayfalararasiveritasimagorselnesne.databinding.ActivityBBinding


class ActivityB : AppCompatActivity() {
    private lateinit var bBinding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bBinding= ActivityBBinding.inflate(layoutInflater)
        setContentView(bBinding.root)

        val gelenMesaj = intent.getStringExtra("mesaj")
        bBinding.textViewCikti.text=gelenMesaj
    }
}