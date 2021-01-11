package com.tugfeivecek.timerserviceuygulamasi

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.widget.Toast

class TimerServis : Service() {
    private lateinit var handler:Handler

    private val thread =object :Runnable {

        override fun run() {
            Toast.makeText(this@TimerServis, "Servis çalışmaya devam ediyor", Toast.LENGTH_SHORT).show()
            this@TimerServis.handler.postDelayed(this,5000)
        }
    }
    //intent yoluyla servise veri gonderme metodu
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    //Servisi basşlatmak
    override fun onCreate() {
        Toast.makeText(this, "Servis çalışmaya başladı", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        Toast.makeText(this, "Servis durdu", Toast.LENGTH_SHORT).show()
    }
}