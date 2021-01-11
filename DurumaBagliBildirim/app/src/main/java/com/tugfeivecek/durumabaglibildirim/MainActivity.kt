package com.tugfeivecek.durumabaglibildirim

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import com.tugfeivecek.durumabaglibildirim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonBildir.setOnClickListener {

            val builder: NotificationCompat.Builder
            //Sistem servisi kullanıcaz
            val bildirimYoneticisi = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

            val intent = Intent(this, MainActivity::class.java)
            //requestcode istek kodu bildirime tıkladıgımız zaman ıstedıgımız sayfaya gecis
            val gidilecekIntent = PendingIntent.getActivity(this, 1, intent, PendingIntent.FLAG_UPDATE_CURRENT)

            //Surum kontrolu
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                //oreo sonrası guncel surum
                //bildirimler aynı turde
                val kanalId = "kanaIld"
                val kanalAd = "kanalAd"
                val kanalTanitim = "kanalTanitim"
                //oncelik olarak one al
                val kanalOnceligi = NotificationManager.IMPORTANCE_HIGH

                var kanal: NotificationChannel? = bildirimYoneticisi.getNotificationChannel(kanalId)

                if (kanal == null) {
                    kanal = NotificationChannel(kanalId, kanalAd, kanalOnceligi)
                    kanal.description = kanalTanitim
                    bildirimYoneticisi.createNotificationChannel(kanal)
                }

                builder = NotificationCompat.Builder(this, kanalId)
                builder.setContentTitle("Başlık")
                        .setContentText("İçerik")
                        .setSmallIcon(R.drawable.resim)
                        .setContentIntent(gidilecekIntent)
                        .setAutoCancel(true) //bildirime tıkladıktan sonra otomatik kaybolucak
            //eski surum
            } else {
                builder = NotificationCompat.Builder(this)
                builder.setContentTitle("Başlık")
                        .setContentText("İçerik")
                        .setSmallIcon(R.drawable.resim)
                        .setContentIntent(gidilecekIntent)
                        .setAutoCancel(true) //bildirime tıkladıktan sonra otomatik kaybolucak
                        .priority = Notification.PRIORITY_HIGH
            }

            //bildirimi gostermemız gerekıyor
            bildirimYoneticisi.notify(1,builder.build())
        }
    }
}