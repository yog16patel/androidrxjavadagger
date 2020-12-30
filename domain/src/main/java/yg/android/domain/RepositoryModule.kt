package yg.android.domain

import dagger.Binds
import dagger.Module
import dagger.Reusable
import yg.android.domain.repository.QuoteRepositoryImpl
import yg.android.domain.repository.QuoteRepository

@Module
abstract class RepositoryModule {

    @Binds
    @Reusable
    internal abstract fun bindQuoteRepository(quoteRepositoryImpl: QuoteRepositoryImpl): QuoteRepository
}