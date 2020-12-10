package com.tugfeivecek.ilerikotlin

import java.lang.ArithmeticException
import java.lang.Exception


// Derleyici hatası (Complier Error):Derleme öncesi yakalanan hatalar - karakter hataları - sentax hataları
// Hata(Exception): Çalışma anında(runtime) gerçekleşen hatalar - sistem hataları -dizi indeksi asıldı -cihaz hataları

fun main() {
    val x = 10
    val y = 0

    val dizi = Array<Int>(2) { 0 } // boyutu 2 ıcınde 0 lar olsun

    try {

        //Kontrol edilecek kodlama buraya yazılır

        println("Sonuc: ${x / y}")
        println("İslem tamam")
        dizi[4] = 8

    } catch (e: Exception) {

        if (e is ArithmeticException) {
            println("İkinci sayı sıfıra bolunmez")
        }

        if (e is ArrayIndexOutOfBoundsException) {
            println("Dizinin boyutunu aştınız")
        }
    }catch (e:ArrayIndexOutOfBoundsException) {


    }
        //hata olusunca burası calısır
        println("Ikınci sayi sıfıra bolunemez")
    }

       //Thread (Multi Tasking -Çok işlemcilik )
       //Tek bir program akısı icerisinde birden fazla islemin gerceklestirilmesi Java'da Thread sınıfıyla mumkundur