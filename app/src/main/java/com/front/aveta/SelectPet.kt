package com.front.aveta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.front.aveta.databinding.FragmentCycleLengthSelectionDayBinding
import com.front.aveta.databinding.FragmentSelectPetBinding


class SelectPet : Fragment(R.layout.fragment_select_pet) {
    private var _binding: FragmentSelectPetBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSelectPetBinding.bind(view)


        ///Bottom Menu
        binding.menuSettings.setOnClickListener(){
            findNavController().navigate(R.id.settings)
        }

        binding.menuReports.setOnClickListener(){
            findNavController().navigate(R.id.reportsPage)
        }
        binding.menuAddnote.setOnClickListener(){
            findNavController().navigate(R.id.addPost)
        }
        binding.menuReminder.setOnClickListener(){
            findNavController().navigate(R.id.reminders)
        }
        binding.menuWallet.setOnClickListener(){
            findNavController().navigate(R.id.wallet1)
        }

        ///Bottom Menu ends

        binding.mtBTN.setOnClickListener(){
            findNavController().navigate(R.id.calendar)
        }
    }

    //mtBTN

}