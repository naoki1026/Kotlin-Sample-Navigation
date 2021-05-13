package com.example.kotlin_sample_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kotlin_sample_navigation.databinding.FragmentSecondBinding
import com.example.kotlin_sample_navigation.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private var _binding : FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThirdBinding.inflate(layoutInflater)
        _binding?.let {
            it.button.setOnClickListener {
                findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
            }
        }

        return binding.root

    }
}