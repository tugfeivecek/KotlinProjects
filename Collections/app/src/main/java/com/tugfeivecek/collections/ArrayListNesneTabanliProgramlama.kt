package com.tugfeivecek.collections

fun main(){
// Arraylist sınıfından olusturdugum nesneler
     val u1= Urun(1,"Saat",150.0)
     val u2= Urun(2,"Tv",1750.0)
     val u3= Urun(3,"Bilgisayar",960.0)

    val urunler=ArrayList<Urun>()  //Arraylist ıcıne burdaki nesneleri eklemek icin sınıftan alırım
    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    for(urun in urunler ){
        println("**********************")
        println("Ürün no: ${urun.urunNo}")
        println("Ürün ad: ${urun.urunAd}")
        println("Ürün fiyat: ${urun.urunFiyat}")
    }
}