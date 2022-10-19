package com.udacity.shoestore.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeViewModel:ViewModel() {

    // Create a LiveData with a String
    val shoelist: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}