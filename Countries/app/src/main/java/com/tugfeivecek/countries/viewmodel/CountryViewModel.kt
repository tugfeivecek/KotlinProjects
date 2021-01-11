package com.tugfeivecek.countries.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tugfeivecek.countries.model.Country
import com.tugfeivecek.countries.service.CountryDatabase
import kotlinx.coroutines.launch

class CountryViewModel(application: Application) : BaseViewModel(application) {

    //secilen countryi almak
    val countryLiveData = MutableLiveData<Country>()

    //internetten cektigimizi local veri tabanina eklicez
    fun getDataFromRoom(uuid: Int) {
//        val country = Country("Turkey","Asia","Ankara","TRY","Turkish","www.ss.com")
//        countryLiveData.value =country
        launch {

            val dao = CountryDatabase(getApplication()).countryDao()
            val country = dao.getCountry(uuid)
            countryLiveData.value = country

        }

    }
}
