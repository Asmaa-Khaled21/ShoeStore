package com.udacity.shoestore.fragment

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSplashBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_splash, container, false
        )

        Handler(Looper.myLooper()!!).postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
        },5000)

        return binding.root
    }
}