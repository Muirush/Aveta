package com.front.aveta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.front.aveta.databinding.FragmentSignUpBinding
import com.front.aveta.databinding.FragmentSignUpCodeBinding


class signUpCode : Fragment(R.layout.fragment_sign_up_code) {
    private var _binding: FragmentSignUpCodeBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSignUpCodeBinding.bind(view)
        binding.imageView3.setOnClickListener(){
            findNavController().navigate(R.id.signIn)
        }
        binding.imageView2.setOnClickListener(){
            findNavController().popBackStack()
        }
    }

}