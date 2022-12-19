package com.theapache64.composeterminaltemplate.ui.home

import com.theapache64.cyclone.core.Activity
import com.theapache64.cyclone.core.Intent

class HomeActivity : Activity() {
    companion object {

        private const val KEY_NAME = "name"

        fun getStartIntent(name: String): Intent {
            return Intent(HomeActivity::class).apply {
                putExtra(KEY_NAME, name)
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        val name = getStringExtra(KEY_NAME)
        println("Name is '$name'")
    }
}