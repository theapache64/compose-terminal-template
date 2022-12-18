package com.theapache64.composeterminaltemplate.app

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component
interface AppComponent {
    fun inject(app: App)
}


