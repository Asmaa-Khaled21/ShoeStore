package com.udacity.shoestore

import android.os.Bundle
import android.support.v4.media.session.MediaSessionCompat.Token.fromBundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.Person.fromBundle
import androidx.databinding.DataBindingUtil
import androidx.media.AudioAttributesCompat.fromBundle
import androidx.navigation.findNavController
import com.udacity.shoestore.databinding.FragmentInsructionOneBinding

class InsructionOneFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentInsructionOneBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_insruction_one, container, false
        )
        binding.NextButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_insructionOneFragment_to_instrutionTwoFragment2)

        }
        return binding.root
    }
}