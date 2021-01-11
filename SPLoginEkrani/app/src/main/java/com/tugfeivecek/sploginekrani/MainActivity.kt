package com.tugfeivecek.sploginekrani

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tugfeivecek.sploginekrani.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //shared preferences yapisi
        //girisbilgi bir dosya
        val sp = getSharedPreferences("GirisBilgi", Context.MODE_PRIVATE)

        //uygulama cokmesin
        val ogka = sp.getString("kullaniciAdi","kullanıcı adı yok")
        val ogs = sp.getString("sifre","sifre yok")

        if(ogka == "admin" && ogs== "123"){
            startActivity(Intent(this@MainActivity,AnaEkranActivity::class.java))
            finish()
        }

        binding.buttonGiris.setOnClickListener {

            val ka =binding.editTextKullanici.text.toString()
            val s =binding.editTextSifre.text.toString()

            if(ka == "admin" && s=="123") {

                val editor = sp.edit()
                editor.putString("kullaniciAdi",ka)
                editor.putString("sifre",s)
                //dosyaya kaydet
                editor.commit()

                startActivity(Intent(this@MainActivity,AnaEkranActivity::class.java))
                finish()
            }
            else{
                Toast.makeText(applicationContext,"Hatalı Giris",Toast.LENGTH_SHORT).show()
            }

        }
    }
}