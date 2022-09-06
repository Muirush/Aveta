package com.front.aveta

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.front.aveta.databinding.FragmentReportsPageBinding
import com.front.aveta.databinding.FragmentSettingsBinding

class Settings : Fragment(R.layout.fragment_settings) {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSettingsBinding.bind(view)


        //actions
        binding.languageS.setOnClickListener(){
            findNavController().navigate(R.id.languageSettings)
        }
        binding.contactInfoS.setOnClickListener(){
            findNavController().navigate(R.id.contactInfo)
        }
        binding.privacy.setOnClickListener(){
            findNavController().navigate(R.id.privacyPolicy)
        }
        binding.appSuggestionsS.setOnClickListener(){
            findNavController().navigate(R.id.appSuggestions)
        }
        binding.deleteAc.setOnClickListener(){
           val dialog = LogOutDialog1()
            dialog.isCancelable = false
            dialog.show((activity as AppCompatActivity).supportFragmentManager, "Show delete dialog")

        }
        binding.logOut.setOnClickListener(){
            val ldialog = LogOutDialog()
            ldialog.isCancelable = false
            ldialog.show((activity as AppCompatActivity).supportFragmentManager, "Show logout dialog")
        }
        binding.buySubscription.setOnClickListener(){
            findNavController().navigate(R.id.tarrifPlan)
        }




    }

}