package com.udacity.shoestore.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentItemBinding
import com.udacity.shoestore.databinding.FragmentSplashBinding

class ItemFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentItemBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_item, container, false
        )
        return binding.root
    }
}