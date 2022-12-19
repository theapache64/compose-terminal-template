package com.theapache64.composeterminaltemplate.ui.splash

import com.theapache64.composeterminaltemplate.data.repo.AppRepo
import com.theapache64.cyclone.core.livedata.LiveData
import com.theapache64.cyclone.core.livedata.MutableLiveData
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    appRepo: AppRepo
) {

    private val _welcomeMsg = MutableLiveData<String>()
    val welcomeMsg: LiveData<String> = _welcomeMsg

    init {
        _welcomeMsg.value = if (appRepo.args.isNullOrEmpty()) "🌍 Hello World!" else "👋🏻 Hello ${appRepo.args}"
    }
}
