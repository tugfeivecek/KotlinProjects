package com.tugfeivecek.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }
// Anasayfaya donme
    override fun onBackPressed() {

        val yeniIntent =Intent(Intent.ACTION_MAIN)
        yeniIntent.addCategory(Intent.CATEGORY_HOME)
        yeniIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(yeniIntent)
    }
}