package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.udacity.shoestore.databinding.FragmentInsructionOneBinding
import com.udacity.shoestore.databinding.FragmentInstrutionTwoBinding

class InstrutionTwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentInstrutionTwoBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_instrution_two, container, false
        )
        return binding.root
    }
}