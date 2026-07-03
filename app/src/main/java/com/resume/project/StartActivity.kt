package com.resume.project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.resume.project.databinding.ActivityStartBinding

class StartActivity: AppCompatActivity() {
    private  lateinit var binding: ActivityStartBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
    }
}