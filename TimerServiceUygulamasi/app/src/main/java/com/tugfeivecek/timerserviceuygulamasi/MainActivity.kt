package com.tugfeivecek.timerserviceuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugfeivecek.timerserviceuygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBasla.setOnClickListener {
            startService(Intent(this@MainActivity, TimerServis::class.java))

        }
        binding.buttonDur.setOnClickListener {
            stopService(Intent(this@MainActivity, TimerServis::class.java))
        }
    }
}