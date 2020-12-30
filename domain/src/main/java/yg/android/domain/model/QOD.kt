package yg.android.domain.model

import com.google.gson.annotations.SerializedName

data class QOD(
    @SerializedName("contents")
    val contents: Contents = Contents(
        emptyList()
    )
)