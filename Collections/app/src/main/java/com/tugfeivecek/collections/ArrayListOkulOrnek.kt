package com.tugfeivecek.collections

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    val girdi = Scanner(System.`in`)

    var sayac=1
    // dısarda olussun ıcerde sadece kayıt yapılsın
    val ogrenciler=ArrayList<Ogrenci>()
    // while donguau dısında tanımla ıcı sılınır her seferınde

    // true dedigimiz ıcın sonsuz dongu
    while (true) {
        println("Ogrenci adı giriniz")
        val ad= girdi.next()

        println("Ogrenci sınıfı giriniz")
        val sinif=girdi.next()

        // her dongu olsuturdugumda bir nesne
          val yeniOgrenci=Ogrenci(sayac,"ahmet","11F")
          sayac=sayac+1

        ogrenciler.add(yeniOgrenci)
        println("Çıkmak için (1) - Devam etmek icin diger sayilar")

        val cikis = girdi.nextInt()
        if (cikis == 1) {
            for(ogrenci in ogrenciler){
                println("***********************")

                println("Ogrenci no: ${ogrenci.no}")
                println("Ogrenci adi: ${ogrenci.ad}")
                println("Ogrenci sınıf: ${ogrenci.sinif}")
            }

            println("Çıkış yapıldı")

            break
        }

    }
}