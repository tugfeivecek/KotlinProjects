package com.tugfeivecek.snackbarcalismasi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.tugfeivecek.snackbarcalismasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNormal.setOnClickListener { nesne ->
            Snackbar.make(nesne,"Merhaba",Snackbar.LENGTH_SHORT).show()
        }

        binding.buttonGeriDonus.setOnClickListener { x->
            Snackbar.make(x,"Mesaj silinsin mi ? ",Snackbar.LENGTH_SHORT)
                .setAction("EVET"){y->

                    Snackbar.make(y,"Merhaba",Snackbar.LENGTH_SHORT).show()
            }.show()

        }
        binding.buttonOzel.setOnClickListener { z->
            val sb= Snackbar.make(z,"Internet baglantısı yok",Snackbar.LENGTH_LONG)

            sb.setAction("Tekrar dene"){

            }
            sb.setActionTextColor(Color.RED)
            sb.setTextColor(Color.BLUE)
            sb.setBackgroundTint(Color.WHITE)
            sb.show()
        }
    }
}