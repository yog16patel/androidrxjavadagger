package yg.android.domain.model

import com.google.gson.annotations.SerializedName

data class Contents(
    @SerializedName("quotes")
    val quotes: List<Quote>
)