package com.resume.project.ui.catalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.resume.project.databinding.FCatalogBinding

class CatalogFragment: Fragment() {

    private lateinit var binding: FCatalogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FCatalogBinding.inflate(layoutInflater)
        return binding.root
    }
}