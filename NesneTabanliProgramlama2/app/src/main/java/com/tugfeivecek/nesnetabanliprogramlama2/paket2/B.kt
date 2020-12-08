package com.tugfeivecek.nesnetabanliprogramlama2.paket2

import com.tugfeivecek.nesnetabanliprogramlama2.paket1.A

class B {  // class B: A() Yaparsak protecteda erisebilirz
    fun fonksiyon(){
        val nesne = A()
        println(nesne.internalDegisken)
        println(nesne.publicDegisken)
        println(nesne.varsayilanDegisken)
       // println(nesne.privateDegisken) ulasamıyor
       // println(nesne.protectedDegisken) erisemiyoruz

    }
}