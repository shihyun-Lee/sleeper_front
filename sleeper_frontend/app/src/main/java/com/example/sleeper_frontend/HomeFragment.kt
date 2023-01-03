package com.example.sleeper_frontend

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import com.example.sleeper_frontend.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.btnShowMore.setOnClickListener {
            clickBtnPopup()
        }

        return binding.root
    }

    private fun clickBtnPopup() {
        val popup = Dialog(MainActivity::class.java)
        popup.requestWindowFeature(Window.FEATURE_NO_TITLE)
        popup.window?.setBackgroundDrawableResource(android.R.color.transparent)
        popup.setContentView(R.layout.popup_dialog)

        popup.show()
    }
}