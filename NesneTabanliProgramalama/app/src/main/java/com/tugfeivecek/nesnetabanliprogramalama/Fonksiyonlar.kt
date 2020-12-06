package com.tugfeivecek.nesnetabanliprogramalama

fun main() {
    // sonuc donermeyen parametresız fonk.
    fun selamla() {
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }
    selamla()

    // donus tipi olan fonk.donus tipini fonksiyon tanımının en sonunda belirt
    fun selamla1(): String {
        val sonuc = "Merhaba Mehmet"
        return sonuc
    }

    val gelenSonuc = selamla1()
    println(gelenSonuc)

    fun selamla2(isim: String){
        val sonuc = "Merhaba $isim"
        println(sonuc)

}
     selamla2("Zeynep")
    fun toplama(){
        val toplam= 30 +40
        println("Toplama : $toplam")

    }
    toplama()

    fun toplama1():Int{
        val toplam= 30 +90
        return toplam
    }
    val t1=toplama1()
    println("t1: $t1")

    fun toplama2(sayi1:Int,sayi2:Int):Int {
        val toplam= sayi1 + sayi2
        return toplam

}
    val t2=toplama2(100,200)
}