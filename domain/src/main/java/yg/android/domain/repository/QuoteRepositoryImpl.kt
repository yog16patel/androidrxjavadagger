package yg.android.domain.repository

import io.reactivex.Observable
import yg.android.domain.api.ApiInterface
import yg.android.domain.model.QOD
import javax.inject.Inject

class QuoteRepositoryImpl
@Inject constructor(private val apiInterface: ApiInterface) :
    QuoteRepository {
    override fun getQOD(): Observable<QOD> {
        val ob = apiInterface.getQOD()
        return ob.map {
           it
        }

    }
}