package com.unsoed.informatikamobile.data.model

import androidx.appcompat.widget.DialogTitle
import com.google.gson.annotations.SerializedName
import java.io.Serial

data class SearchResponse(
    @SerializedName(value = "docs")
    val docs: List<BookDoc>
)

data class BookDoc(
    @SerializedName(value = "tittle")
    val title: String?,
    @SerializedName(value = "author_name")
    val authorName: List<String>?,
    @SerializedName(value = "first_publish_year")
    val firstPublishYear: int?,
    )