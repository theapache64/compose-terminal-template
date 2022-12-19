package com.theapache64.composeterminaltemplate.di.module

import com.theapache64.composeterminaltemplate.data.repo.AppRepo
import com.theapache64.composeterminaltemplate.data.repo.AppRepoImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RepoModule {

    @Binds
    abstract fun bindAppRepo(appRepo: AppRepoImpl) : AppRepo
}