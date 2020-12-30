package yg.android.qod

import android.content.Context
import dagger.Binds
import dagger.Module
import yg.android.QuoteApplication
import javax.inject.Singleton

@Module
abstract class PresentationModule {

    @Binds
    @Singleton
    internal abstract fun presentationContext(application: QuoteApplication) : Context


}