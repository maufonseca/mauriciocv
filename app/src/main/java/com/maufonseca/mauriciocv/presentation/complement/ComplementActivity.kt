package com.maufonseca.mauriciocv.presentation.complement

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.TextView

import com.maufonseca.mauriciocv.R
import com.maufonseca.mauriciocv.infrastructure.ComplementRequester
import com.maufonseca.mauriciocv.model.Snippet
import com.maufonseca.mauriciocv.presentation.list.ListActivity
import com.maufonseca.mauriciocv.presentation.list.SnippetAdapter

class ComplementActivity : ListActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val titleView = findViewById<TextView>(R.id.title_textview)
    titleView.text = getString(R.string.complementary_activities)
    val appsRecyclerView = findViewById<RecyclerView>(R.id.content_recyclerview)
    appsRecyclerView.adapter = SnippetAdapter(this, ComplementRequester.complement)
  }
}
