package com.tugfeivecek.floatinglable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.tugfeivecek.floatinglable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // trim metodu ile boslukları siliyoruz white spaceleri siliyoruz
        binding.buttonYap.setOnClickListener {
            val ad= binding.edittextAd.text.toString().trim()
            val tel= binding.edittextTel.text.toString().trim()

            //verileri bos girdiginde ışlem yapmaması uyarı vermesını sağlar
            if(TextUtils.isEmpty(ad)){
                Toast.makeText(applicationContext,"Ad bos" ,Toast.LENGTH_SHORT).show()
                //islemlere devam etmemesi icin
               // return@setOnClickListener
            }
            if(TextUtils.isEmpty(tel)){
                Toast.makeText(applicationContext,"Tel bos" ,Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(tel.length < 6){
                Toast.makeText(applicationContext,"Tel en az 6 hane olmalıdır." ,Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            Toast.makeText(applicationContext,"$ad - $tel" ,Toast.LENGTH_SHORT).show()
        }
    }
}