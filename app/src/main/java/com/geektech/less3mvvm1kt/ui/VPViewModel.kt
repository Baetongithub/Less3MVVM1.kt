package com.geektech.less3mvvm1kt.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VPViewModel : ViewModel() {

     private var counter = 0
     private var builder = StringBuilder()

     val counterLD = MutableLiveData<Int>()
     val countLDState = MutableLiveData<String>()

    fun onAdditionCLick() {
        counter++
        counterLD.value = counter
        countLDState.value = builder.toString()
        builder.append("onAdditionCLick" + " + ")
    }

    fun onSubtractCLick() {
        counter--
        counterLD.value = counter
        countLDState.value = builder.toString()
        builder.append("onSubtractCLick" + " - ")
    }

    init {
        counterLD.postValue(0)
        countLDState.postValue("")
    }

}