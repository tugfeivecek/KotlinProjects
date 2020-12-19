package com.tugfeivecek.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugfeivecek.backstack.databinding.ActivityBBinding
import com.tugfeivecek.backstack.databinding.ActivityMainBinding

class ActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnGoC.setOnClickListener() {
            val intent = Intent(this@ActivityB, ActivityC::class.java)
            startActivity(intent)
        }
    }
}