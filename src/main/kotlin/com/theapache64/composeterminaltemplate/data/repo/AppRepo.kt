package com.theapache64.composeterminaltemplate.data.repo

import javax.inject.Inject
import javax.inject.Singleton

interface AppRepo {
    var args: List<String>?
}

@Singleton
class AppRepoImpl @Inject constructor() : AppRepo {
    override var args: List<String>? = null
}