package com.tugfeivecek.progressbarsliderratingbarkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import com.tugfeivecek.progressbarsliderratingbarkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBasla.setOnClickListener(){
            binding.progressBar.visibility = View.VISIBLE
        }
        binding.buttonDur.setOnClickListener(){
            binding.buttonDur.visibility =View.INVISIBLE
        }
        binding.slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            //SLIDER
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
              // degistirmek istedigim an anlık sonucu verir
                binding.textViewSonuc.text = "Sonuç : $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })
        binding.buttonGoster.setOnClickListener(){
            val gelenIlerleme = binding.slider.progress
            val gelenOylama = binding.ratingBar.rating

            Log.e("İlerleme",gelenIlerleme.toString())
            Log.e("oylama",gelenOylama.toString())
        }
    }
}