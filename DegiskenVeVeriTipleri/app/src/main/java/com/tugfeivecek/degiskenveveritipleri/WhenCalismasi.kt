package com.tugfeivecek.degiskenveveritipleri

fun main(){

    val gun=9
    // val degerine gore 9 olmadigi icin boyle bir gun yok calisiyor
    when(9){
        1-> println("Pazartesi")
        2-> println("Salı")
        3-> println("Çarşamba")
        4-> println("Perşembe")
        5-> println("Cuma")
        6-> println("Cumartesi")
        7-> println("Pazar")
        else-> println("Boyle bir gun yok")
    }
}