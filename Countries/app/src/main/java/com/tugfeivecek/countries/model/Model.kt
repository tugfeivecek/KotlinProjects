package com.tugfeivecek.countries.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity //Room kullanmak icin
//sonuna soru isreti koydugunda bos gelebilir
data class Country(
    @ColumnInfo(name = "name")
    //bu degiskenler apide hangi bicimle geliyosa onu yaziyoruz
    @SerializedName("name")
    val countryName: String?,
    @ColumnInfo(name = "region")
    @SerializedName("region")
    val countryRegion: String?,
    @ColumnInfo(name = "capital")
    @SerializedName("capital")
    val countryCapital: String?,
    @ColumnInfo(name = "currency")
    @SerializedName("currency")
    val countryCurrency: String?,
    @ColumnInfo(name = "language")
    @SerializedName("language")
    val countryLanguage: String?,
    @ColumnInfo(name = "flag")
    @SerializedName("flag")
    val imageUrl: String?
)
//room ıcın
{
    @PrimaryKey(autoGenerate = true)
    var uuid: Int = 0
}
