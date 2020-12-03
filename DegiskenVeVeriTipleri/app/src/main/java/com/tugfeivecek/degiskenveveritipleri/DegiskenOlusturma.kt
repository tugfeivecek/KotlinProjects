package com.tugfeivecek.degiskenveveritipleri

fun main(){
    var ogrenciAdi = "ahmet"
    var ogrenciYas= 23
    var ogrenciBoy= 1.98
    var ogrenciBasHarf= "a"

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)

    var urun_id : Int = 3418
    var urun_ad : String = "Kol Saati"
    var urun_adet : Int = 100
    var urun_fiyat : Double = 109.99
    var urun_tedarikci : String = "rolex"

    println(urun_id)
    println(urun_ad)
    println(urun_adet)
    println(urun_fiyat)
    println(urun_tedarikci)
    // & ifadeyi yazdırmamız için
    println("$urun_tedarikci marka $urun_ad $urun_fiyat fiyatlarla satılmaktadır. Stokta $urun_adet adet kalmıştır.")

    var a = 30
    var b = 20
    // ${a+b} a ve b yi toplar direk yazdırır
    println("$a ve $b 'nin toplamı : ${a+b}")

    var sayi = 10
    var s1 = 80
    var s2 = 70

    var toplam = s1+s2


}