package yg.android.di

import android.app.Activity
import android.content.Context
import dagger.Binds
import dagger.Module
import yg.android.annotation.ActivityScope
import yg.android.qod.MainActivity


@Module
internal abstract class BaseActivityModule {

    @Binds
    @ActivityScope
    internal abstract fun activityContext(activity : Activity) : Context

    @Binds
    @ActivityScope
    internal abstract fun baseActivity(baseActivity: MainActivity) : Activity


}