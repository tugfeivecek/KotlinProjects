package com.tugfeivecek.toolbarkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tugfeivecek.toolbarkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title="Özel Toolbar Başlık"
        binding.toolbar.subtitle="Özel Toolbar AltBaslik"
        binding.toolbar.setLogo(R.drawable.resim)
        binding.toolbar.setTitleTextColor(resources.getColor(R.color.black))

        setSupportActionBar(binding.toolbar)
    }
}