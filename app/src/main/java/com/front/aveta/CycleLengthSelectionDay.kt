package com.front.aveta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.front.aveta.databinding.FragmentCycleLengthSelectionDayBinding
import com.front.aveta.databinding.FragmentWelcomeBinding


class CycleLengthSelectionDay : Fragment(R.layout.fragment_cycle_length_selection_day) {
    private var _binding: FragmentCycleLengthSelectionDayBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCycleLengthSelectionDayBinding.bind(view)
        binding.cardView6.setOnClickListener(){
            findNavController().navigate(R.id.cycleLengthSelection)
        }
    }

}