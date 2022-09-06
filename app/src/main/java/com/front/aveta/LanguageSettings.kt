package com.front.aveta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.front.aveta.databinding.FragmentLanguageSettingsBinding
import com.front.aveta.databinding.FragmentSettingsBinding


class LanguageSettings : Fragment(R.layout.fragment_language_settings) {
    private var _binding: FragmentLanguageSettingsBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentLanguageSettingsBinding.bind(view)

        binding.tvEnglish.setOnClickListener(){
            binding.imgEng.visibility = View.VISIBLE
            binding.imgEsp.visibility = View.INVISIBLE
            binding.imgHin.visibility = View.INVISIBLE
            binding.imgPyc.visibility = View.INVISIBLE


        }
        binding.tvEspanol.setOnClickListener(){
            binding.imgEng.visibility = View.INVISIBLE
            binding.imgEsp.visibility = View.VISIBLE
            binding.imgHin.visibility = View.INVISIBLE
            binding.imgPyc.visibility = View.INVISIBLE

        }
        binding.tvHindi.setOnClickListener(){
            binding.imgEng.visibility = View.INVISIBLE
            binding.imgEsp.visibility = View.INVISIBLE
            binding.imgHin.visibility = View.VISIBLE
            binding.imgPyc.visibility = View.INVISIBLE


        }
        binding.tyPyc.setOnClickListener(){
            binding.imgEng.visibility = View.INVISIBLE
            binding.imgEsp.visibility = View.INVISIBLE
            binding.imgHin.visibility = View.INVISIBLE
            binding.imgPyc.visibility = View.VISIBLE


        }
    }
}