package com.rivvana.viewmodelkotlin

import androidx.lifecycle.MutableLiveData

class MainViewModel {
    var counter : MutableLiveData<Int> = MutableLiveData(0)
    fun increment(){
        counter.postValue(counter.value?.plus(1))
    }

    fun decrement(){
        counter.value?.let {
            if (it > 0){
                counter.postValue(counter.value?.minus(1))
            }
        }
    }
}