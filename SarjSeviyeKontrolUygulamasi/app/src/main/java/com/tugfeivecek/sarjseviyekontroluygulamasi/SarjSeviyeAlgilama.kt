package com.tugfeivecek.sarjseviyekontroluygulamasi

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SarjSeviyeAlgilama : BroadcastReceiver (){
    override fun onReceive(context : Context?, p1: Intent?) {

        Toast.makeText(context,"Şarjınız bitmek üzere .",Toast.LENGTH_SHORT).show()
    }

}