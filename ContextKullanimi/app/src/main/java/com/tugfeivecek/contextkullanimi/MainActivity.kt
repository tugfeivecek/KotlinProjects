package com.tugfeivecek.contextkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tugfeivecek.contextkullanimi.databinding.ActivityMainBinding


//Activity'e işaret eder
//yani kod parçasının nerde çalışacağını göstermiş olursun

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(){

            Toast.makeText(this,"MERHABA",Toast.LENGTH_SHORT).show()
           // Toast.makeText(this@MainActivity,"MERHABA",Toast.LENGTH_SHORT).show()
            //Toast.makeText(applicationContext,"MERHABA",Toast.LENGTH_SHORT).show()

            //FRAGMENTLARDA SU SEKILDE OLUSUR hangi activitye baglıysa o sekılde calısır
            //Toast.makeText(activity,"MERHABA",Toast.LENGTH_SHORT).show()


        }
    }
}