package com.theapache64.composeterminaltemplate.ui.splash

import com.theapache64.composeterminaltemplate.di.module.GodModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [GodModule::class])
interface SplashComponent {
    fun inject(splashActivity: SplashActivity)
}