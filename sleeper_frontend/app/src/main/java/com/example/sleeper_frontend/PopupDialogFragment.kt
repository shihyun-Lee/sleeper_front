package com.example.sleeper_frontend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.sleeper_frontend.databinding.FragmentPopupDialogBinding


open class PopupDialogFragment : DialogFragment() {
    private lateinit var binding : FragmentPopupDialogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPopupDialogBinding.inflate(inflater, container, false)

        return binding.root
    }

    fun getInstance() : PopupDialogFragment {
        return PopupDialogFragment()
    }
}