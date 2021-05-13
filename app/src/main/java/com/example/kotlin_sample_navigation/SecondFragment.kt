package com.example.kotlin_sample_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.kotlin_sample_navigation.databinding.FragmentFirstBinding
import com.example.kotlin_sample_navigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding : FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(layoutInflater)
        _binding?.let {
            it.button.setOnClickListener {
                findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
            }
        }
        return binding.root
    }
}