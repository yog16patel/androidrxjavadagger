package yg.android.qod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import yg.android.domain.model.QOD
import yg.android.usecase.GetQODUseCase
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    private val TAG = "MainActivity"

    @Inject
    internal lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    internal lateinit var useCase: GetQODUseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        useCase.execute({
            Log.e(TAG,"QOD : $it")
            processResponse(it)
        },{
            Log.e(TAG,"error : $it")

        })

    }

    private fun processResponse(qod: QOD) {
        Log.e(TAG,"qod : $qod")
        text_view.text = qod.contents.quotes[0].quote
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }
}