package com.front.aveta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.front.aveta.databinding.FragmentAddPostBinding
import com.front.aveta.databinding.FragmentWallet2Binding


class AddPost : Fragment(R.layout.fragment_add_post) {
    private var _binding: FragmentAddPostBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAddPostBinding.bind(view)

        binding.btSave.setOnClickListener() {
            findNavController().popBackStack()
        }
    }
}