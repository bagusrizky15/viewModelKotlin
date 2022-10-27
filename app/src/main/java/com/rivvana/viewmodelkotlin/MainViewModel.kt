package com.rivvana.viewmodelkotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var counter : MutableLiveData<Int> = MutableLiveData(0)

    fun increment(angkaPertama: String, angkaKedua: String){
        counter.postValue(angkaPertama.toInt()+angkaKedua.toInt())
    }

    fun decrement(angkaPertama: String, angkaKedua: String){
        counter.postValue(angkaPertama.toInt()-angkaKedua.toInt())
    }

}