package com.maufonseca.mauriciocv.presentation.myapps

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.TextView

import com.maufonseca.mauriciocv.R
import com.maufonseca.mauriciocv.infrastructure.AppsRequester
import com.maufonseca.mauriciocv.model.AppSnippet
import com.maufonseca.mauriciocv.presentation.list.ListActivity

class AppsActivity : ListActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val titleView = findViewById<TextView>(R.id.title_textview)
    titleView.text = getString(R.string.apps)
    val appsRecyclerView = findViewById<RecyclerView>(R.id.content_recyclerview)
    appsRecyclerView.adapter = AppSnippetAdapter(this, AppsRequester.apps)
  }
}
