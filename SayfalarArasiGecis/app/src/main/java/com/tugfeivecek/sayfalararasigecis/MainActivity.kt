package com.tugfeivecek.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugfeivecek.sayfalararasigecis.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
// sayfalar arası gecis 1.ana sınıfın 2.gecmek istedigim sınıf
        binding.buttonGoToB.setOnClickListener(){
            val yeniIntent = Intent(this@MainActivity,ActivityB::class.java)
            startActivity(yeniIntent)
        }

    }
}