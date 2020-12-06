package com.tugfeivecek.nesnetabanliprogramalama


// Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri donduren metod
//50 gb 100 TL
//Kota askımından sonra her 1GB 4 TL

class InternetUcretiClass {
    fun internetUcretiHesaplama(Gb:Int):Int{
        var ucret=0

        if(Gb>50) {
            val kotFazlasi = Gb - 50
            ucret=100+kotFazlasi*4
        }
        else{
            ucret=100
        }
        return ucret
    }
}