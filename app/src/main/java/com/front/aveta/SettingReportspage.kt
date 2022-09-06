package com.front.aveta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.front.aveta.databinding.FragmentReportsPageBinding
import com.front.aveta.databinding.FragmentSettingReportspageBinding

class SettingReportspage : Fragment(R.layout.fragment_setting_reportspage) {
    private var _binding: FragmentSettingReportspageBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingReportspageBinding.bind(view)
        binding.cvPremium.setOnClickListener(){
            findNavController().navigate(R.id.tarrifPlan)
        }
        binding.apply {
            imageView8.setOnClickListener (){
                findNavController().navigate(R.id.tarrifPlan)
            }
            imageView8.setOnClickListener (){
                findNavController().popBackStack()
            }
        }
    }

}