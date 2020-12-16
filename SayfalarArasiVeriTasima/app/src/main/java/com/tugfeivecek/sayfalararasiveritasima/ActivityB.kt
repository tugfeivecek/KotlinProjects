package com.tugfeivecek.sayfalararasiveritasima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        //keyler ile verilerimizi alma
        val gelenMesaj= intent.getStringExtra("mesaj")
        // string verisinin yazımında hata olursa defaultvalue degerını alıyo
        val gelenYas= intent.getIntExtra("yas",0)
        val gelenBoy= intent.getDoubleExtra("boy",0.0)


        Log.e("MESAJ",gelenMesaj.toString())
        Log.e("YAŞ",gelenYas.toString())
        Log.e("BOY",gelenBoy.toString())


        // tur olarak serizable donuyo cast yaparak kisiler sınıfına donusturebılıriz
        val gelenKisi= intent.getSerializableExtra("nesne") as Kisiler
        Log.e("Kişi TcNo",(gelenKisi.tcno).toString())
        Log.e("Kişi Boy",(gelenKisi.boy).toString())
        Log.e("Kişi isim",(gelenKisi.isim))

    }
}