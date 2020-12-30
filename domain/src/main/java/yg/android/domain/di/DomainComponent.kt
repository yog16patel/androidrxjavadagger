package yg.android.domain.di

import dagger.Component
import yg.android.domain.api.ApiInterface
import yg.android.domain.di.NetworkModule
import yg.android.domain.di.RepositoryModule
import yg.android.domain.repository.QuoteRepository
import javax.inject.Singleton

@Component(
    modules = [
        RepositoryModule::class,
        NetworkModule::class
    ]
)
@Singleton
interface DomainComponent {
    fun getQuoteRepository() : QuoteRepository
    fun getApiInterface() : ApiInterface
}