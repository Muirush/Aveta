package com.front.aveta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.front.aveta.databinding.FragmentWallet1Binding
import com.front.aveta.databinding.FragmentWallet2Binding


class Wallet2 : Fragment(R.layout.fragment_wallet2) {
    private var _binding: FragmentWallet2Binding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentWallet2Binding.bind(view)

//        binding.cardView6.setOnClickListener() {
//            findNavController().navigate(R.id.wallet2)
//        }
    }


}