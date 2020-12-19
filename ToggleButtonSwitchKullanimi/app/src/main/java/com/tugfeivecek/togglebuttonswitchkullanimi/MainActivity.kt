package com.tugfeivecek.togglebuttonswitchkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tugfeivecek.togglebuttonswitchkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switch1.setOnCheckedChangeListener { compoundButton, b ->

            if(b) {
                Log.e("Switch", "on")

            } else {
                Log.e("Switch", "off")
            }
        }

        binding.toggleButton.setOnCheckedChangeListener { compoundButton, b ->

            if(b) {
                Log.e("toggleButton", "on")

            } else {
                Log.e("toggleButton", "off")
            }
        }

        binding.button.setOnClickListener(){
            val switchDurum=binding.switch1.isChecked
            val toggleButtonDurum = binding.toggleButton.isChecked
            Log.e("toggleButton", "on")

        }
    }
}