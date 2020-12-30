package yg.android.domain.di

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import yg.android.domain.api.ApiInterface
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideAPI(retrofit: Retrofit) : ApiInterface {
        return retrofit.create(ApiInterface::class.java)
    }

    @Singleton
    @Provides
    fun provideRetrofit(client: OkHttpClient) : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://quotes.rest/")
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideOKHttpProvider(httpLoggingInterceptor : HttpLoggingInterceptor) : OkHttpClient{
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder()
        client.addInterceptor(httpLoggingInterceptor)
        return client.build()
    }

    @Singleton
    @Provides
    fun provideHttpLoggingInterceptor() : HttpLoggingInterceptor{
        return HttpLoggingInterceptor()
    }

}