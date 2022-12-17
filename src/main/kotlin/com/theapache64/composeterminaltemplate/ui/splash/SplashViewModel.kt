package com.theapache64.composeterminaltemplate.ui.splash

import com.theapache64.composeterminaltemplate.data.repo.AppRepo
import com.theapache64.composeterminaltemplate.di.module.GodClass
import com.theapache64.cyclone.core.livedata.LiveData
import com.theapache64.cyclone.core.livedata.MutableLiveData
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SplashViewModel @Inject constructor(
    appRepo: AppRepo,
    godClass : GodClass
) {

    init {
        println("SplashVM says GodClass is $godClass")
    }

    private val _welcomeMsg = MutableLiveData<String>()
    val welcomeMsg: LiveData<String> = _welcomeMsg

    init {
        _welcomeMsg.value = if (appRepo.args != null) "Hello ${appRepo.args}" else "Hello World!"
    }
}