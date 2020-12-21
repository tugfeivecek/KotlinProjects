package com.tugfeivecek.popupmenuolusturma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.PopupMenu
import com.tugfeivecek.popupmenuolusturma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val popup = PopupMenu(this@MainActivity,binding.button)
            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)
            popup.show()
        }
    }
}