package com.resume.project.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.resume.project.databinding.FHomeBinding

class HomeFragment: Fragment() {

    private lateinit var binding: FHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FHomeBinding.inflate(layoutInflater)
        return binding.root
    }
}