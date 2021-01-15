package com.octavianmetta.visueleapp.core.di.module

import com.octavianmetta.visueleapp.core.di.ActivityScoped
import com.octavianmetta.visueleapp.ui.MainActivity
import com.octavianmetta.visueleapp.ui.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ActivityScoped
    @ContributesAndroidInjector
    abstract fun contributeSplashActivity(): SplashActivity

    @ActivityScoped
    @ContributesAndroidInjector()
    abstract fun contributeMainActivity(): MainActivity


}