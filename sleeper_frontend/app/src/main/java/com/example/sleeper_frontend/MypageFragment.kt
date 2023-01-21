
package com.example.sleeper_frontend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sleeper_frontend.databinding.FragmentMypageBinding

class MypageFragment : androidx.fragment.app.Fragment(R.layout.fragment_mypage) {
    private lateinit var binding: FragmentMypageBinding //변수선언

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageBinding.inflate(inflater, container, false)

        return binding.root


    }

}