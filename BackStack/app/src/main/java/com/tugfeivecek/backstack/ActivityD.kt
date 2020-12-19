package com.tugfeivecek.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
    }

    override fun onBackPressed() {
        val intent= Intent(this@ActivityD,ActivityB::class.java)

        // back stack ile yonunu değiştirmiş oluruz back stack sılmek ıcın
        //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        finish()
        startActivity(intent)
    }
}

// Finish() metodu kendinden bir önceki activityi back stack'den siler dondugu aktıvıtıye kaldıgı yerden devam eder.