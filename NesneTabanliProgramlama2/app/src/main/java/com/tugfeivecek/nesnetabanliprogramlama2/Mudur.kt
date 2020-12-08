package com.tugfeivecek.nesnetabanliprogramlama2

class Mudur:Personel() {

    //personel sınıfınden turemıs
    fun iseAl(p: Personel) {
        p.iseAlindi()
    }

    fun terfiEttir(p: Personel) {
        //  (p as Ogretmen).maasArttir()
        if (p is Ogretmen) {
            p.maasArttir()
        }

        if (p is Isci) {
            println("isciler terfi alamaz.")
        }
    }
}
