package com.tugfeivecek.spinnerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.tugfeivecek.spinnerkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val ulkeler = ArrayList<String>()
    private lateinit var binding: ActivityMainBinding
    //lateinit null demeden adaptor olusturdum
    private lateinit var veriAdaptoru:ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ulkeler.add("Türkiye")
        ulkeler.add("Almanya")
        ulkeler.add("Fransa")
        ulkeler.add("ABD")
        ulkeler.add("Rusya")
        ulkeler.add("Çin")
        ulkeler.add("Portekiz")

        //satır tasarımına erişicem uzerınde textview secicem

        // layout tasarım text idsine erştim veri kumemi veriyorum ekle adaptore ekledim, veri kumesini islicek yapi
        veriAdaptoru= ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,ulkeler)

        //adaptorude spinnera yerleştirdim
        binding.spinner.adapter=veriAdaptoru


        binding.spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{

            // item secili oldugunda calisicak metod ,indeks sayesinde icerisindeki veirye erisebilirim
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, indeks: Int, p3: Long) {

                Toast.makeText(applicationContext,"Secilen ulke: ${ulkeler[indeks]}",Toast.LENGTH_SHORT).show()
            }

            //hicbir sey tercih edilmezse secilecek metod
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        //binding.spinner.selectedItemPosition spinnerın en son secildiği itemı bana getirir butonla eismis olurum
        binding.buttonGoster.setOnClickListener {
            Toast.makeText(applicationContext,"Ulke: ${ulkeler[binding.spinner.selectedItemPosition]}",Toast.LENGTH_SHORT).show()
        }


    }
}