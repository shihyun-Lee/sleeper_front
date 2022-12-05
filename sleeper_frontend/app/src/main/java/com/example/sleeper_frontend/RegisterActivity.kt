package com.example.sleeper_frontend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.example.sleeper_frontend.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)

        val window = window
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        val binding: ActivityRegisterBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.activityRegisterLayout.setBackgroundResource(R.drawable.login_background)

    }
}