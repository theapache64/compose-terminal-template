package com.theapache64.composeterminaltemplate.data.repo

import javax.inject.Inject

class AppRepo @Inject constructor() {
    init {
        println("New instance created : $this")
    }

    var args: Array<String>? = null
}