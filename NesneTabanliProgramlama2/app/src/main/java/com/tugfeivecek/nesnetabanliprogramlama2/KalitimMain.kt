package com.tugfeivecek.nesnetabanliprogramlama2

fun main(){
    val araba = Araba("Kırmızı","otomatik","sedan")
    println(araba.renk)
    println(araba.vites)
    println(araba.kasaTipi)

    //ozellik aktarmak istiyosak basina open
    val nissan = Nissan("Beyaz","manuel","sedan", "micra")

    nissan.model
    nissan.renk
    nissan.kasaTipi

    // ust sınıf alt sınıfa erısebılır alt sınıf ust sınıfa erısemez
}