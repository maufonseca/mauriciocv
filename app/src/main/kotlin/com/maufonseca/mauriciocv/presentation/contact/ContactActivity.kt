package com.maufonseca.mauriciocv.presentation.contact

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView

import com.maufonseca.mauriciocv.R

class ContactActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_contact)

    val email = findViewById<TextView>(R.id.email_textview)
    email.text = Html.fromHtml("<a href=\"mailto:maubfon@gmail.com\">E-mail: maubfon@gmail.com</a>")
    email.movementMethod = LinkMovementMethod.getInstance()
    val github = findViewById<TextView>(R.id.github_textview)
    github.text = Html.fromHtml("<a href=\"http://github.com/maufonseca\">GitHub: /maufonseca</a>")
    github.movementMethod = LinkMovementMethod.getInstance()
  }

  fun backTouched(v: View) {
    finish()
  }
}
