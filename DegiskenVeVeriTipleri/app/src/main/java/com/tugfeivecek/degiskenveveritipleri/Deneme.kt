package com.tugfeivecek.degiskenveveritipleri

class Deneme {

    var x= 10 //global variable
    var y= 20
    fun topla(){
        var x=40 // local degisken globale gore baskındır
        var z= x+y
        println(z)
    }
}