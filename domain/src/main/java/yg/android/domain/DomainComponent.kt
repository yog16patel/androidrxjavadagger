package yg.android.domain

import dagger.Component
import yg.android.domain.api.ApiInterface
import yg.android.domain.api.NetworkModule
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