package com.tugfeivecek.countries.service

import com.tugfeivecek.countries.model.Country
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class CountryAPIService {

    //https://raw.githubusercontent.com/atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json
    //Base_url -> https://raw.githubusercontent.com/

    private val BASE_URL = "https://raw.githubusercontent.com/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()) //json kullacagımızı soylememiz lazim
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) //rxjava kulladigimizi belirtmek
        .build()
        .create(CountryAPI::class.java) //Apı ile bagliyoruz

    fun getData(): Single<List<Country>> {
        return api.getCountries()
    }
}