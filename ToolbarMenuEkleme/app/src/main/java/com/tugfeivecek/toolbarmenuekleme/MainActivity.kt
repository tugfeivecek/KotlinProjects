package com.tugfeivecek.toolbarmenuekleme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.tugfeivecek.toolbarmenuekleme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toolbar.title="Toolbar menu"
        setSupportActionBar(binding.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_bilgi -> {
                Toast.makeText(applicationContext, "Bilgi Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_ayarlar -> {
                Toast.makeText(applicationContext, "Ayarlar Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_ekle-> {
                Toast.makeText(applicationContext, "Ekle Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_cikis -> {
                Toast.makeText(applicationContext, "Çıkış Tıklandı", Toast.LENGTH_SHORT).show()
                return true
            }
            else ->   return super.onOptionsItemSelected(item)
        }

    }
}