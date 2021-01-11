package com.tugfeivecek.countries.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext
//Coroutine icin olusturduk
abstract class BaseViewModel(application: Application) : AndroidViewModel(application),
    CoroutineScope {
    //iş olsuturuyo arka planda yapilacak is
    private val job = Job()
    //once isini yap sonra main threade don
    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

//app kapatılarsa destroy olursa bu is iptal edilecektir
    override fun onCleared() {
        super.onCleared()
        job.cancel()
    }
}