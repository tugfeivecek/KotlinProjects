package com.tugfeivecek.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugfeivecek.sayfalararasigecis.databinding.ActivityBBinding
import com.tugfeivecek.sayfalararasigecis.databinding.ActivityMainBinding

class ActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_b)
        binding= ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonGoToC.setOnClickListener(){
            val yeniIntent = Intent(this@ActivityB,ActivityC::class.java)
            startActivity(yeniIntent)
        }

    }
}