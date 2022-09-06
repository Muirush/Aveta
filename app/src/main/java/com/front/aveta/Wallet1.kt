package com.front.aveta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.front.aveta.databinding.FragmentTarrifPlanBinding
import com.front.aveta.databinding.FragmentWallet1Binding


class Wallet1 : Fragment(R.layout.fragment_wallet1) {
    private var _binding: FragmentWallet1Binding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentWallet1Binding.bind(view)

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

        binding.cardView6.setOnClickListener() {
            findNavController().navigate(R.id.wallet2)
        }
    }


}