package com.maufonseca.mauriciocv.presentation.development

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView

import com.maufonseca.mauriciocv.R

class DevActivity : AppCompatActivity() {

  @Suppress("DEPRECATION")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_dev)
    val titleView = findViewById<TextView>(R.id.title_textview)
    titleView.text = getString(R.string.about)
    val email = findViewById<TextView>(R.id.email_textview)
    val github = findViewById<TextView>(R.id.github_textview)
    val playstore = findViewById<TextView>(R.id.link_textview)
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
      email.text = Html.fromHtml("<a href=\"mailto:maubfon@gmail.com\">maubfon@gmail.com</a>", Html.FROM_HTML_MODE_COMPACT)
      github.text = Html.fromHtml("<a href=\"http://github.com/maufonseca/mauriciocv\">github.com/maufonseca/mauriciocv</a>", Html.FROM_HTML_MODE_COMPACT)
      playstore.text = Html.fromHtml("<a href=\"https://play.google.com/store/apps/details?id=com.maufonseca.mauriciocv\">avaliar aplicativo</a>", Html.FROM_HTML_MODE_COMPACT)
    } else {
      email.text = Html.fromHtml("<a href=\"mailto:maubfon@gmail.com\">maubfon@gmail.com</a>")
      github.text = Html.fromHtml("<a href=\"http://github.com/maufonseca/mauriciocv\">github.com/maufonseca/mauriciocv</a>")
      playstore.text = Html.fromHtml("<a href=\"https://play.google.com/store/apps/details?id=com.maufonseca.mauriciocv\">avaliar aplicativo</a>")
    }
    email.movementMethod = LinkMovementMethod.getInstance()
    github.movementMethod = LinkMovementMethod.getInstance()
    playstore.movementMethod = LinkMovementMethod.getInstance()
  }

  @Suppress("UNUSED_PARAMETER")
  fun backTouched(v: View) {
    finish()
  }
}
