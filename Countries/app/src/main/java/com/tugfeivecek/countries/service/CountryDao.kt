package com.tugfeivecek.countries.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.tugfeivecek.countries.model.Country
//ROOM icin
@Dao
interface CountryDao {

    //Data Access Object

    @Insert
    suspend fun insertAll(vararg countries: Country) : List<Long> //objeleri tek tek veriyoruz

    //Insert -> INSERT INTO
    // suspend -> coroutine, pause & resume
    // vararg -> multiple country objects
    // List<Long> -> primary keys


    @Query("SELECT * FROM country") // butun countryleri getir
    suspend fun getAllCountries() : List<Country>

    @Query("SELECT * FROM country WHERE uuid = :countryId") //countryidye esit olanlari cek
    suspend fun getCountry(countryId : Int) : Country

    @Query("DELETE FROM country") //tum veritabanini silmek icin
    suspend fun deleteAllCountries()


}