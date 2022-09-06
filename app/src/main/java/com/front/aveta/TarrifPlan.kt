package com.front.aveta

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.front.aveta.databinding.FragmentRemindersBinding
import com.front.aveta.databinding.FragmentTarrifPlanBinding


class TarrifPlan : Fragment(R.layout.fragment_tarrif_plan) {

    private var _binding: FragmentTarrifPlanBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentTarrifPlanBinding.bind(view)







        binding.buySubscription.setOnClickListener() {
            findNavController().navigate(R.id.addPost)
        }
    }
}
