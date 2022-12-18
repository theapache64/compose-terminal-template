package com.theapache64.composeterminaltemplate.ui.splash

import dagger.Component

@Component
interface SplashComponent {
    fun inject(splashActivity: SplashActivity)
}
