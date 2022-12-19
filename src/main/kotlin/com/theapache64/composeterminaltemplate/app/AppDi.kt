package com.theapache64.composeterminaltemplate.app

import com.theapache64.composeterminaltemplate.di.module.RepoModule
import com.theapache64.composeterminaltemplate.ui.splash.SplashActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        RepoModule::class
    ]
)
interface AppComponent {
    fun inject(app: App)
    fun inject(splashActivity: SplashActivity)
}


