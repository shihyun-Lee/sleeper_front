package com.example.sleeper_frontend

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import com.example.sleeper_frontend.databinding.FragmentHomeBBinding
import com.example.sleeper_frontend.databinding.FragmentHomeBinding

class HomeBFragment : Fragment(R.layout.fragment_home_b) {

    private lateinit var binding: FragmentHomeBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBBinding.inflate(inflater, container, false)

        binding.btnShowMore.setOnClickListener {
            clickBtnPopup()
        }

        return binding.root
    }

    private fun clickBtnPopup() {
        val popup : PopupDialogFragment = PopupDialogFragment().getInstance()
        activity?.supportFragmentManager?.let { fragmentManager ->
            popup.show(
                fragmentManager,
                "tag"
            )
        }
    }
}