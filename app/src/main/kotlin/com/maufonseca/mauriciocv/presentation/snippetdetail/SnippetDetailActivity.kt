package com.maufonseca.mauriciocv.presentation.snippetdetail

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

import com.maufonseca.mauriciocv.R
import com.maufonseca.mauriciocv.model.Snippet

class SnippetDetailActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_snippet_detail)
    val currentSnippet = intent.getParcelableExtra<Snippet>("snippet")
    val titleView = findViewById<TextView>(R.id.title_textview)
    val bodyView = findViewById<TextView>(R.id.body_textview)
    titleView.text = currentSnippet.shortDescription
    bodyView.text = currentSnippet.longDescription

  }

  fun backTouched(v: View) {
    finish()
  }
}
