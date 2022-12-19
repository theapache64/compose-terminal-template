package com.myterminal.di.module

import com.myterminal.data.repo.AppRepo
import com.myterminal.data.repo.AppRepoImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RepoModule {

    @Binds
    abstract fun bindAppRepo(appRepo: AppRepoImpl) : AppRepo
}