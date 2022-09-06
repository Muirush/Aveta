package com.front.aveta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.front.aveta.databinding.FragmentSignInBinding
import com.front.aveta.databinding.FragmentSignUpBinding


class signUp : Fragment(R.layout.fragment_sign_up) {
    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSignUpBinding.bind(view)

        binding.imageView2.setOnClickListener(){
            findNavController().popBackStack()
        }
        binding.imageView3.setOnClickListener(){
            findNavController().navigate(R.id.signUpCode)
        }
    }

}