package com.maufonseca.mauriciocv.model

class AppSnippet(title: String,
                 subtitle: String,
                 shortDescription: String,
                 longDescription: String,
                 var urlAndroid: String?,
                 var urliOS: String?,
                 var isAndroidApp: Boolean,
                 var isIosApp: Boolean,
                 var isWebApp: Boolean) : Snippet(title, subtitle, shortDescription, longDescription) {

  val htmlUrlAndroid: String
    get() = "<a href=\"$urlAndroid\">Ver na Play Store</a>"
  val htmlUrliOS: String
    get() = "<a href=\"$urliOS\">Ver na iTunes Store</a>"
}
