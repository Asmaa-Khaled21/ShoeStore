package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentInsructionBinding

class InsructionFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentInsructionBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_insruction, container, false
        )
        binding.NextButton.setOnClickListener { view: View ->
            view.findNavController()

        }
        return binding.root
    }
}