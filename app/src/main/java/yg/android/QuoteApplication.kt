package yg.android

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import yg.android.domain.DaggerDomainComponent
import yg.android.qod.DaggerPresentationComponent
import javax.inject.Inject

class QuoteApplication : Application(), HasAndroidInjector {

    @Inject
    internal lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        DaggerPresentationComponent.factory().create(
            this,
            DaggerDomainComponent.builder().build()
        ).inject(this)

    }
    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }
}