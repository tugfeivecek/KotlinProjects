package com.tugfeivecek.nesnetabanliprogramalama

// Extension fonksıyonlar kotlin icinde bulunan sınıfları gensletmek icim kullanılan pratik bir yol

fun main(){
    fun Int.carpi(sayi:Int):Int{
        return this*sayi // this metodun isminin onundeki sayıyı ifade eder
    }
    val sonuc=5.carpi(2)
    println(sonuc)
}