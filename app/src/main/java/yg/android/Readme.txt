Dagger :

1.
    Add dependent Component in the main Component
    E.g.
    In PresentationComponent,
     fun create(
                @BindsInstance application: QuoteApplication,
                domainComponent: DomainComponent
            ): PresentationComponent


2.
    just define interfaces in the dagger(Component)

    fun getQuoteRepository() : QuoteRepository
    fun getApiInterface() : ApiInterface

    Here QuoteRepository, ApiInterface are interfaces

