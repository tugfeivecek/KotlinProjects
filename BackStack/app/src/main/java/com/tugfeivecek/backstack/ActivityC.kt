package com.tugfeivecek.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugfeivecek.backstack.databinding.ActivityBBinding
import com.tugfeivecek.backstack.databinding.ActivityCBinding
import com.tugfeivecek.backstack.databinding.ActivityMainBinding

class ActivityC : AppCompatActivity() {
    private lateinit var binding: ActivityCBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityCBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoD.setOnClickListener(){
            val intent= Intent(this@ActivityC,ActivityD::class.java)
            startActivity(intent)
        }
    }
}