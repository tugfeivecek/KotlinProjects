package com.tugfeivecek.gpsuygulama

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.tugfeivecek.gpsuygulama.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var izinKontrol = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //requestPermission() izin istegini sorma diyalogunu acar
        //onRequestPermissionsResult izin istegi diyalogu acıldıktan sonra verilen cevaplar bu metot ile takip edilir.

        binding.buttonKonumAl.setOnClickListener {
            izinKontrol =ContextCompat.checkSelfPermission(this@MainActivity, Manifest.permission.ACCESS_FINE_LOCATION)
            //izin aktif edilmemişse burası çalışsın
            if(izinKontrol != PackageManager.PERMISSION_GRANTED){
                // hangi izinleri calıstırıcaksan
                    Toast.makeText(applicationContext,"izin onaylandı ve aktif edildi",Toast.LENGTH_SHORT).show()
                ActivityCompat.requestPermissions(this@MainActivity, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),100)
            } else {

            }

        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        if( requestCode == 100){
            //onay varsa if islemine basla
            if(grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){

            }
        }
    }
}