package com.udacity.shoestore.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentAddItemBinding
import com.udacity.shoestore.models.SharedShoeViewModel
import com.udacity.shoestore.models.Shoe
import kotlinx.android.synthetic.main.fragment_add_item.*

class AddItemFragment : Fragment() {
    private lateinit var sharedShoeViewModel: SharedShoeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding :FragmentAddItemBinding = DataBindingUtil.inflate(
           inflater, R.layout.fragment_add_item,container,false
       )

        sharedShoeViewModel = ViewModelProvider(requireActivity()).get(sharedShoeViewModel::class.java)

        binding.sharedViewModel = sharedShoeViewModel
        binding.shoe= Shoe("",0.0,"","")

        return binding.root
    }
}