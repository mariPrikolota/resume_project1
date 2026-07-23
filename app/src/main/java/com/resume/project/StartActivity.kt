package com.resume.project

import android.os.Bundle
import android.util.Log
import android.util.SparseArray
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.resume.project.databinding.ActivityStartBinding

class StartActivity: AppCompatActivity() {

    private  lateinit var binding: ActivityStartBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onControllerNavigation()
    }

    private fun onControllerNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_container) as NavHostFragment
        navController = navHostFragment.navController
        binding.navigation.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            supportFragmentManager.fragments.forEach { fragment ->
                if (fragment.isVisible) {
                    fragment.view?.saveHierarchyState(SparseArray())
                }
            }
        }

        binding.navigation.setOnItemReselectedListener { item ->

          /*  when (item.itemId) {
                R.id.navigation_profil -> {
                    findNavController(R.id.nav_host_container_profile).navigateSafe(R.id.action_main)
                }
                R.id.navigation_catalog -> {
                    findNavController(R.id.nav_host_container_catalog).navigateSafe(R.id.action_main)
                }
                R.id.navigation_home -> {
                    findNavController(R.id.nav_host_container_home).navigateSafe(R.id.action_main)
                }
                R.id.navigation_favorit -> {
                    findNavController(R.id.nav_host_container_favorite).navigateSafe(R.id.action_main)

                }
            }*/
        }
    }

    private fun NavController.navigateSafe(resId: Int) {
        val destinationId = currentDestination?.getAction(resId)?.destinationId.orEmpty()
        currentDestination?.let { node ->
            val currentNode = when (node) {
                is NavGraph -> node
                else -> node.parent
            }
            if (destinationId != 0) {
                currentNode?.findNode(destinationId)?.let { navigate(resId) }
            }
        }}

    private fun Int?.orEmpty(default: Int = 0): Int {
        return this ?: default
    }
}