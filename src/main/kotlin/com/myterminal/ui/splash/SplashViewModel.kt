package com.myterminal.ui.splash

import com.myterminal.data.repo.AppRepo
import com.theapache64.cyclone.core.livedata.LiveData
import com.theapache64.cyclone.core.livedata.MutableLiveData
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    appRepo: AppRepo
) {

    private val _welcomeMsg = MutableLiveData<String>()
    val welcomeMsg: LiveData<String> = _welcomeMsg

    private val _goToHome = MutableLiveData<String>()
    val goToHome: LiveData<String> = _goToHome

    init {
        val splashMsg = if (appRepo.args.isNullOrEmpty()) "🌍 Hello World!" else "👋🏻 Hello ${appRepo.args}"
        _welcomeMsg.value = splashMsg
        _goToHome.value =splashMsg
    }


}
