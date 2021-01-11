package com.tugfeivecek.sarjseviyekontroluygulamasi

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var sarjSeviyeAlgilama: SarjSeviyeAlgilama
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sarjSeviyeAlgilama = SarjSeviyeAlgilama()

    }

    override fun onResume() {
        super.onResume()
        val filter = IntentFilter()
        filter.addAction("android.intent.action.BATTERY_LOW")
     
    }
}