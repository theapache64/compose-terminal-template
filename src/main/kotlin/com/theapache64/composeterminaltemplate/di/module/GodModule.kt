package com.theapache64.composeterminaltemplate.di.module

import dagger.Module
import dagger.Provides


class GodClass(
    val name: String
){
    init {
        println("God instance created : $this")
    }
}

@Module
class GodModule {

    @Provides
    fun provideGod(): GodClass {
        return GodClass(name = "X")
    }
}