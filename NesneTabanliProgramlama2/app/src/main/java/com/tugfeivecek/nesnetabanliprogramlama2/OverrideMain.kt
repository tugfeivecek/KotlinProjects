package com.tugfeivecek.nesnetabanliprogramlama2
fun main(){

    val hayvan =Hayvan()
    hayvan.sesCikar()

    val memeli =Memeli()
    memeli.sesCikar()
    //open class Memeli : Hayvan() dedğımız ıcın hayvandaki sesim yoku alıyo
    val kedi =Kedi()
    kedi.sesCikar()

    val kopek =Kopek()
    kopek.sesCikar()
/*Polymorphism cok bizimlilik olması ıcın ıkı sınıf aasında kalıtım olmalıdır
* superclass gıbı gorunur subclass gıbı davranır*/
}