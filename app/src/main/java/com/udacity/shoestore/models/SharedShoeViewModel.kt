package com.udacity.shoestore.models

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.udacity.shoestore.repo.Repo

class SharedShoeViewModel:ViewModel() {

    private val _shoe = MutableLiveData<ArrayList<Shoe>>()

    val shoe: LiveData<ArrayList<Shoe>>
        get() = _shoe

    fun addShoe(v: View, shoe: Shoe){
        _shoe.value?.add(shoe)
        navigateUp(v)
    }
    init {
        getShoes()
    }
    fun getShoes(){
        _shoe.value = Repo().getShoesData()
    }

    fun navigateUp(v: View){
        v.findNavController().navigateUp()
    }

}