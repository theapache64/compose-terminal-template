package com.theapache64.composeterminaltemplate.app

import com.theapache64.composeterminaltemplate.data.repo.AppRepo
import com.theapache64.composeterminaltemplate.ui.splash.SplashActivity
import com.theapache64.cyclone.core.Application
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppController @Inject constructor(
    private val appRepo: AppRepo,
)
  {
    fun onArgs(args: Array<String>?) {
        appRepo.args = args?.toList()
    }
}

/**
 * Application class
 */
class App : Application() {

    companion object {
        var args: Array<String>? = null
        lateinit var di : AppComponent
    }

    @Inject
    lateinit var appController: AppController

    override fun onCreate() {
        super.onCreate()
        di = DaggerAppComponent.create()
        di.inject(this)

        appController.onArgs(args)

        val splashIntent = SplashActivity.getStartIntent()
        startActivity(splashIntent)
    }
}

/**
 * Entry point
 */
fun main(args: Array<String>) {
    println(args.toList())
    App.args = args
    App().onCreate()
}