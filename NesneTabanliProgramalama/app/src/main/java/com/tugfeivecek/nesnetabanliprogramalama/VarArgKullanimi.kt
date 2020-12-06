package com.tugfeivecek.nesnetabanliprogramalama

fun main(){
    // vararg İstenildigi kadar veri girilebilen parametre
    fun toplam(vararg sayilar:Int) :Int{ // 3,4,5
        var sonuc=0

        for(s in sayilar){
            sonuc=sonuc+s

        }
        return sonuc
    }

    val t1=toplam(1,2,3,4,5) // istedğimiz kadar veri girebiliriz
    println("t1 : $t1")
}

