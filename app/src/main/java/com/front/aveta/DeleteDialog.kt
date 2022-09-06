package com.front.aveta

import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

class DeleteDialog() : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var rootView: View = layoutInflater.inflate(R.layout.delete_dialog, container,false)
        return  rootView
//        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        val displayMetrics = DisplayMetrics()
        requireActivity().windowManager.defaultDisplay.getMetrics(displayMetrics)

        val width = displayMetrics.widthPixels
        val height = displayMetrics.heightPixels

        dialog?.window?.setLayout(width-64, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val BTyes: Button = view.findViewById(R.id.yesBT)
        val BTno: Button = view.findViewById(R.id.noBT)
        BTyes.setOnClickListener(){
            dismiss()
        }
        BTno.setOnClickListener(){
            dismiss()
        }

    }

}
