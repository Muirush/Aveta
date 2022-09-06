package com.front.aveta

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class LogOutDialog1 : DialogFragment(){


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (dialog != null && dialog?.window != null) {
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT));
            dialog?.window?.requestFeature(Window.FEATURE_NO_TITLE);
        }

        var rootView: View = layoutInflater.inflate(R.layout.logout_dialog1, container,false)
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
        val BTyes: Button = view.findViewById(R.id.lYesBT)
        val BTno: Button = view.findViewById(R.id.lNoBT)

        BTyes.setOnClickListener(){
          dismiss()
        }
        BTno.setOnClickListener(){
            dismiss()
        }
    }


}
