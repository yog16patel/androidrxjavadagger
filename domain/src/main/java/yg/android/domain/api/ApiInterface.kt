package yg.android.domain.api

import io.reactivex.Observable
import retrofit2.http.GET
import yg.android.domain.model.QOD

interface ApiInterface {
    @GET("qod1")
    fun getQOD(): Observable<QOD>
}