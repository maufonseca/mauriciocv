package com.maufonseca.mauriciocv.presentation.contact

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView

import com.maufonseca.mauriciocv.R

class ContactActivity : AppCompatActivity() {

  @Suppress("DEPRECATION")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_contact)
    val titleView = findViewById<TextView>(R.id.title_textview)
    titleView.text = getString(R.string.contact)
    val email = findViewById<TextView>(R.id.email_textview)
    val github = findViewById<TextView>(R.id.github_textview)

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
      email.text = Html.fromHtml("<a href=\"mailto:maubfon@gmail.com\">E-mail: maubfon@gmail.com</a>", Html.FROM_HTML_MODE_COMPACT)
      github.text = Html.fromHtml("<a href=\"http://github.com/maufonseca\">GitHub: /maufonseca</a>", Html.FROM_HTML_MODE_COMPACT)
    } else {
      email.text = Html.fromHtml("<a href=\"mailto:maubfon@gmail.com\">E-mail: maubfon@gmail.com</a>")
      github.text = Html.fromHtml("<a href=\"http://github.com/maufonseca\">GitHub: /maufonseca</a>")
    }

    email.movementMethod = LinkMovementMethod.getInstance()
    github.movementMethod = LinkMovementMethod.getInstance()
  }

  @Suppress("UNUSED_PARAMETER")
  fun backTouched(v: View) {
    finish()
  }
}
