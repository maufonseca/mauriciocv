package com.maufonseca.mauriciocv.presentation.school

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.TextView

import com.maufonseca.mauriciocv.R
import com.maufonseca.mauriciocv.infrastructure.SchoolRequester
import com.maufonseca.mauriciocv.model.Snippet
import com.maufonseca.mauriciocv.presentation.list.ListActivity
import com.maufonseca.mauriciocv.presentation.list.SnippetAdapter

class SchoolActivity : ListActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val titleView = findViewById<TextView>(R.id.title_textview)
    titleView.text = getString(R.string.academic_formation)
    val appsRecyclerView = findViewById<RecyclerView>(R.id.content_recyclerview)
    appsRecyclerView.adapter = SnippetAdapter(this, SchoolRequester.school)
  }
}
