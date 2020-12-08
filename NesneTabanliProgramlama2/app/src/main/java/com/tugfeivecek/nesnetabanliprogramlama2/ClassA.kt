package com.tugfeivecek.nesnetabanliprogramlama2
// ınterface alıcaksak butun ozellikleri implemente etmek zorundayız
// bır sınıfa birden fazla interface eklenir

class ClassA :Interface1{
    //kalıtımdan farklı olarak parantez yok
    override val degisken: Int=10

    override fun metod1() {
        println("İnterface merhaba")
    }

    override fun metod2(): String {
        return "interface merhaba"
    }

}