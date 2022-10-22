package com.udacity.shoestore.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.databinding.FragmentSheolistBinding
import com.udacity.shoestore.databinding.ItemBinding
import com.udacity.shoestore.models.SharedShoeViewModel

class SheolistFragment : Fragment() {

    private lateinit var binding: FragmentSheolistBinding
    private lateinit var sharedShoeViewModel: SharedShoeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSheolistBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_sheolist, container, false)
        setHasOptionsMenu(true)

        sharedShoeViewModel = ViewModelProvider(requireActivity()).get(SharedShoeViewModel::class.java)

        sharedShoeViewModel.shoe.observe(viewLifecycleOwner, Observer {
            for (shoe in it) {

                DataBindingUtil.inflate<ItemBinding>(
                    layoutInflater,
                    R.layout.item,
                    binding.shoeList,
                    true
                ).apply {
                    this.shoe = shoe

                } }
        })
        binding.fab.setOnClickListener{
            findNavController().navigate(R.id.action_sheo_listFragment_to_addItemFragment)
        }
        return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            requireView().findNavController()
        ) || super.onOptionsItemSelected(item)

    }
}