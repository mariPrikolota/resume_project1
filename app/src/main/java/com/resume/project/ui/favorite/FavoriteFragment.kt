package com.resume.project.ui.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.resume.project.databinding.FFavoriteBinding

class FavoriteFragment: Fragment() {
    private lateinit var binding: FFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FFavoriteBinding.inflate(layoutInflater)
        return binding.root
    }
}