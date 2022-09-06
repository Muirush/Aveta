package com.front.aveta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toast
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.front.aveta.databinding.FragmentMainBinding
import com.front.aveta.databinding.FragmentSignInBinding
import com.google.android.material.snackbar.Snackbar
import java.time.LocalDate
import java.util.Calendar


class signIn : Fragment(R.layout.fragment_sign_in) {
    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSignInBinding.bind(view)

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {


        }





        binding.imageView3.setOnClickListener(){
            findNavController().navigate(R.id.welcome)
        }
        binding.textView8.setOnClickListener(){
            findNavController().navigate(R.id.signUp)
        }
        //Date
        binding.forgotPassword.setOnClickListener(){
           

        }
    }


}