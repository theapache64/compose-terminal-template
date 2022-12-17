package com.theapache64.composeterminaltemplate.app

import com.theapache64.composeterminaltemplate.di.module.GodModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [GodModule::class])
interface AppComponent {
    fun inject(app: App)
}
