package com.tugfeivecek.radiobuttoncheckboxkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.tugfeivecek.radiobuttoncheckboxkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(){

            val javaDurum = binding.checkBoxJava.isChecked
            val kotlinDurum = binding.checkBoxKotlin.isChecked
            val barcelonaDurum = binding.radioButtonBarcelona.isChecked
            val realMadridDurum = binding.checkBoxJava.isChecked

            Log.e("Java Durum",javaDurum.toString())
            Log.e("Kotlin Durum",kotlinDurum.toString())
            Log.e("Barcelona Durum",barcelonaDurum.toString())
            Log.e("Real Madrid Durum",realMadridDurum.toString())

        }

        binding.radioButtonBarcelona.setOnCheckedChangeListener { compoundButton, b ->
            if(b){
                Toast.makeText(applicationContext,"Tebrikler",Toast.LENGTH_SHORT).show()

            }
        }
    }
}