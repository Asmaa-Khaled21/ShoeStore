package com.udacity.shoestore.repo

import com.udacity.shoestore.R
import com.udacity.shoestore.models.Shoe

class Repo {
    fun getShoesData(): ArrayList<Shoe>{

        val shoe = Shoe("Heels", 37.0,"Rose",
            "Cofortable heels." , R.drawable.heels)

        val shoesList = arrayListOf<Shoe>(shoe)

        return shoesList
    }
}