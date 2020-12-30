package yg.android.qod

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import yg.android.di.ActivityInjectionModule
import yg.android.QuoteApplication
import yg.android.annotation.PresentationScope
import yg.android.domain.di.DomainComponent

@PresentationScope
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        PresentationModule::class,
        ActivityInjectionModule::class
    ],
    dependencies = [
        DomainComponent::class
    ]
)
internal interface PresentationComponent : AndroidInjector<QuoteApplication> {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance application: QuoteApplication,
            domainComponent: DomainComponent
        ): PresentationComponent
    }
}