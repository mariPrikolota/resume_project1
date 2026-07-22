package com.resume.project.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.resume.project.databinding.FProfileBinding

class ProfileFragment: Fragment() {
    private lateinit var binding: FProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FProfileBinding.inflate(layoutInflater)
        return binding.root
    }
}