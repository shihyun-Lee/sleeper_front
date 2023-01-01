package com.example.sleeper_frontend

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.example.sleeper_frontend.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val popup: Dialog = Dialog(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)

        val window = window
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityMainLayout.setBackgroundResource(R.drawable.main_background)

        binding.btnShowMore.setOnClickListener {
            popup.requestWindowFeature(Window.FEATURE_NO_TITLE)
            popup.setContentView(R.layout.popup_dialog)
        }
    }
}