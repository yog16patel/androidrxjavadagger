package yg.android

import dagger.Module
import dagger.android.ContributesAndroidInjector
import yg.android.annotation.ActivityScope
import yg.android.qod.MainActivity

@Module
abstract class ActivityInjectionModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [BaseActivityModule::class])
    internal abstract fun mainActivityInjector() : MainActivity
}