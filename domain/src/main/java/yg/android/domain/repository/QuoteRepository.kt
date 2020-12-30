package yg.android.domain.repository

import io.reactivex.Observable
import yg.android.domain.model.QOD

interface QuoteRepository {
    fun getQOD(): Observable<QOD>

}