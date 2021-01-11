package com.tugfeivecek.countries.viewmodel

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tugfeivecek.countries.model.Country
import com.tugfeivecek.countries.service.CountryAPIService
import com.tugfeivecek.countries.service.CountryDatabase
import com.tugfeivecek.countries.util.CustomSharedPreferences
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class FeedViewModel(application: Application) : BaseViewModel(application) {
    //lifecylecı of a viewmodel bir tane lifecyle her turlu tek scope yan cevırısende verileri kaybetmezsin bunu saglar
    //OBSERVABLE: gözlemlenebilir ne olup biitigini lifecyleda tutuyı observerların bu veriye her zaman erisim
    // kreş olmaz manuel halletmene gerek yok

    // Livedata canlı veri olarak tutucaz mutablelivedata
    val countries = MutableLiveData<List<Country>>()

    //hata olursa bir sey gostericez
    val countryError = MutableLiveData<Boolean>()

    //country yukleniyomu
    val countryLoading = MutableLiveData<Boolean>()

    private val countryApiService = CountryAPIService()

    //buyuk bir obje oluyo veri indrince bunun icine atıyourz kullan at hafiza verimliligi
    private val disposable = CompositeDisposable()

    //10 dakika
    private var refreshTime = 10 * 60 * 1000 * 1000 * 1000L

    //shared prefernces
    private var customPreferences = CustomSharedPreferences(getApplication())

    //datalarımızı cekmek icin metot
    fun refreshData() {
        val updateTime = customPreferences.getTime()
        //10 dakikaya gecmediyse sqlden al geyctıyse apıdan al
        if (updateTime != null && updateTime != 0L && System.nanoTime() - updateTime < refreshTime) {
            getDataFromSQLite()
        } else {
            getDataFromAPI()
        }
//        val country = Country("Turkey", "Asia", "Ankara", "TRY", "Turkish", "www.ss.com")
//        val country2 = Country("France", "Europe", "Ankara", "EUR", "French", ".com")
//        val country3 = Country("Germany", "Europe", "Ankara", "EUR", "Turkish", ".com")
//
//        val countryList = arrayListOf<Country>(country, country2, country3)
//        //countries.value MutableLiveData oldugu icin
//        countries.value = countryList
//        countryError.value = false
        //        countryLoading.value = false
    }

    fun refreshFromAPI() {
        getDataFromAPI()
    }

    //sqlitedan datalari alma
    private fun getDataFromSQLite() {
        countryLoading.value = true
        //corotuine icin launch yaziyoruz
        launch {
            val countries = CountryDatabase(getApplication()).countryDao().getAllCountries()
            showCountries(countries)
            Toast.makeText(getApplication(), "Countries From SQLite", Toast.LENGTH_LONG).show()
        }
    }

    //internettten data cekicez
    private fun getDataFromAPI() {
        countryLoading.value = true

        disposable.add(
            countryApiService.getData()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<List<Country>>() {
                    //bir hata olursa ne yapıcaz hata olmazsa ne yapıcaz
                    override fun onSuccess(t: List<Country>) {
                        storeInSQLite(t)
//                        countries.value = t
                        Toast.makeText(getApplication(), "Countries From API", Toast.LENGTH_LONG)
                            .show()
//                        countryError.value = false
//                        countryLoading.value = false
                    }

                    override fun onError(e: Throwable) {
                        countryLoading.value = false
                        countryError.value = true
                        e.printStackTrace()

                    }

                })
        )
    }

    //Coroutine icin
    private fun showCountries(countryList: List<Country>) {
        countries.value = countryList
        countryError.value = false
        countryLoading.value = false
    }

    private fun storeInSQLite(list: List<Country>) {
        //coroutine cagirmak icin
        launch {
            //database olustur
            val dao = CountryDatabase(getApplication()).countryDao()
            //onceden kalan verileri sil
            dao.deleteAllCountries()
            //totypearray dersen listedeki verileri tekil hale getiricektir listeye ekledik
            val listLong = dao.insertAll(*list.toTypedArray()) // -> list -> individual
            //bu dondurdugumuz dizide kendi listemize tek tek ekledik
            var i = 0
            while (i < list.size) {
                list[i].uuid = listLong[i].toInt()
                i = i + 1
            }

            showCountries(list)
        }
        //shared preferences alabilacegimiz en hassas zaman araligi
        customPreferences.saveTime(System.nanoTime())
    }
    //fragmetnlar tok olunca burdan kurtulabılıriz hafıza verimli hale gelir
    override fun onCleared() {
        super.onCleared()

        disposable.clear()
    }


}
