package com.front.aveta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.front.aveta.databinding.FragmentSignInBinding
import com.front.aveta.databinding.FragmentWelcomeBinding


class Welcome : Fragment(R.layout.fragment_welcome) {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentWelcomeBinding.bind(view)
        binding.tapToSet.setOnClickListener(){
            findNavController().navigate(R.id.cycleLengthSelectionDay)
        }
        binding.cardViewDone.setOnClickListener(){
            findNavController().navigate(R.id.cycleLengthSelectionDay)
        }

    }
}