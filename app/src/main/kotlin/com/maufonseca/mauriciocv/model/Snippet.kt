package com.maufonseca.mauriciocv.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
open class Snippet(var title: String = "",
                   var subtitle: String = "",
                   var shortDescription: String = "",
                   var longDescription: String = "") : Parcelable {


  fun matchesQuery(query: String): Boolean {
    return (title.toLowerCase().contains(query.toLowerCase())
        || subtitle.toLowerCase().contains(query.toLowerCase())
        || shortDescription.toLowerCase().contains(query.toLowerCase())
        || longDescription.toLowerCase().contains(query.toLowerCase()))
  }

}
