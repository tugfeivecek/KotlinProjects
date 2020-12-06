package com.tugfeivecek.nesnetabanliprogramalama

class Matematik {
    fun topla(sayi1:Int,sayi2:Int){
        val toplam=sayi1+sayi2
        println("Toplam: $toplam")
    }
    fun cikar(sayi1 :Double,sayi2:Double):Double{
        return sayi1-sayi2
    }
    fun carp( sayi1: Int,sayi2:Int,isim:String){
        val sonuc=sayi1*sayi2
        println("Carpma yapan $isim Sonuç : $sonuc")
    }
    fun bol(sayi1: Double,sayi2: Double):String {
        return "Bolme: ${sayi1/sayi2}"
    }
}