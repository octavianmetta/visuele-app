package com.octavianmetta.visueleapp.core.di.module

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.content.res.Resources
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    abstract fun bindContext(application: Application): Context


    @Module
    companion object {

        const val NAME = "cache-visuele"

        @Provides
        @Singleton
        @JvmStatic
        fun provideSharedPreferences(context: Context): SharedPreferences {
            return context.getSharedPreferences(NAME, Context.MODE_PRIVATE)
        }

        @Provides
        @Singleton
        @JvmStatic
        fun provideResources(context: Context): Resources = context.resources


    }

}
