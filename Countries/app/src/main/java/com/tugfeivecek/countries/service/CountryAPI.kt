package com.tugfeivecek.countries.service

import com.tugfeivecek.countries.model.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountryAPI {

    //retrofitte hangi islemleri yapicaz
    //GET,POST
    //https://raw.githubusercontent.com/atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json
    //Base_url -> https://raw.githubusercontent.com/
    //Ext -> atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json
    //parantez ici hangi adresten indirilecek
    @GET(" atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json")
    //Single rxjava observebla bir defa indirir sonra durur
    fun getCountries(): Single<List<Country>>


}