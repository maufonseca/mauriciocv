package com.maufonseca.mauriciocv.presentation.work

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.TextView

import com.maufonseca.mauriciocv.R
import com.maufonseca.mauriciocv.infrastructure.WorkRequester
import com.maufonseca.mauriciocv.presentation.list.ListActivity
import com.maufonseca.mauriciocv.presentation.list.SnippetAdapter

class WorkActivity : ListActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setListTitle(getString(R.string.work_history))
    val appsRecyclerView = findViewById<RecyclerView>(R.id.content_recyclerview)
    appsRecyclerView.adapter = SnippetAdapter(this, WorkRequester.getWorkHistory())
  }
}
