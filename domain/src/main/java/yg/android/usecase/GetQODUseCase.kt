package yg.android.usecase

import io.reactivex.Observable
import yg.android.domain.model.QOD
import yg.android.domain.repository.QuoteRepository
import javax.inject.Inject

class GetQODUseCase @Inject constructor(
    private val  quoteRepository : QuoteRepository
) : BaseUseCase<QOD>() {

    override fun setupObservable(): Observable<QOD> {
        return quoteRepository.getQOD()
    }
}