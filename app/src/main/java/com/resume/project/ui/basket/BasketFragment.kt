package com.resume.project.ui.basket

import android.os.Binder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.resume.project.databinding.FBasketsBinding

class BasketFragment: Fragment() {

    private lateinit var binding: FBasketsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FBasketsBinding.inflate(layoutInflater)
        return binding.root
    }
}