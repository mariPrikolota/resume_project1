package com.resume.project

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.resume.project.databinding.ActivitySpashBinding

class SpalshActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySpashBinding
    private val splashDuration = 1000L
    private val progressSteps = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startProgressAnimation()
    }


    private fun startProgressAnimation() {
        val progressInterval = splashDuration / progressSteps
        var progress = 0

        Handler(Looper.getMainLooper()).postDelayed(object : Runnable {
            override fun run() {
                progress += 1
                if (progress <= progressSteps) {
                    binding.progressBar.progress = progress
                    Handler(Looper.getMainLooper()).postDelayed(this, progressInterval)
                } else {
                    navigateToMain()
                }
            }
        }, progressInterval)
    }

    private fun navigateToMain() {
        Handler(Looper.getMainLooper()).postDelayed(
            {
                startActivity(
                    Intent(this, StartActivity::class.java).apply {
                        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                    }
                )
                finish()
            },
            200L
        )
    }
}