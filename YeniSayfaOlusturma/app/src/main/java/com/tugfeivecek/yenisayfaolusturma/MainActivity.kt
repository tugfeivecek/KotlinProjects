package com.tugfeivecek.yenisayfaolusturma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.tugfeivecek.yenisayfaolusturma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)

        Log.e("onCreate","Çalıştı")
        binding.benimtextView.setText("Merhaba")


    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart","Çalıştı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume","Çalıştı")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause","Çalıştı")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop","Çalıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","Çalıştı")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart","Çalıştı")
    }
}