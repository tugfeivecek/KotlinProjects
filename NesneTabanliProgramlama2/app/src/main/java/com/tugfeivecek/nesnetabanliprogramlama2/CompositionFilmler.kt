package com.tugfeivecek.nesnetabanliprogramlama2

fun main(){
     val k1= Kategoriler(1,"Dram")
     val k2= Kategoriler(2,"komedi")
     val y1= Yonetmenler(1,"Nuri ")
     val y2= Yonetmenler(2,"Qentin")

    val f1=Filmler(1, "Djganuo",2013,k1,y2)
    println("Film id: ${f1.film_id}")
    println("Film ad: ${f1.film_ad}")
    println("Film yıl: ${f1.film_yil}")
    println("Film id: ${f1.film_id}")
    println("Film kategori: ${f1.kategori.kategori_ad}")
    println("Film yonetmen: ${f1.yonetmen.yonetmen_ad}")
}
// Ust sinifa superclass alt sınıfa subclass denir
