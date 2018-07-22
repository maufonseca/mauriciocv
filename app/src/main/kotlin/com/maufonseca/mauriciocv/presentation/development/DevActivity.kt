package com.maufonseca.mauriciocv.presentation.development

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView

import com.maufonseca.mauriciocv.R

class DevActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_dev)
    val titleView = findViewById<TextView>(R.id.title_textview)
    titleView.text = getString(R.string.about)
    val email = findViewById<TextView>(R.id.email_textview)
    email.text = Html.fromHtml("<a href=\"mailto:maubfon@gmail.com\">maubfon@gmail.com</a>")
    email.movementMethod = LinkMovementMethod.getInstance()
    val github = findViewById<TextView>(R.id.github_textview)
    github.text = Html.fromHtml("<a href=\"http://github.com/maufonseca/mauriciocv\">github.com/maufonseca/mauriciocv</a>")
    github.movementMethod = LinkMovementMethod.getInstance()
    val playstore = findViewById<TextView>(R.id.link_textview)
    playstore.text = Html.fromHtml("<a href=\"https://play.google.com/store/apps/details?id=com.maufonseca.mauriciocv\">avaliar aplicativo</a>")
    playstore.movementMethod = LinkMovementMethod.getInstance()
  }

  fun backTouched(v: View) {
    finish()
  }
}
