package com.maufonseca.mauriciocv.presentation.portfolio

import android.os.Bundle
import android.support.v7.widget.RecyclerView

import com.maufonseca.mauriciocv.R
import com.maufonseca.mauriciocv.infrastructure.PortfolioRequester
import com.maufonseca.mauriciocv.presentation.list.ListActivity

class PortfolioActivity : ListActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setListTitle(getString(R.string.portfolio))

    val appsRecyclerView = findViewById<RecyclerView>(R.id.content_recyclerview)
    appsRecyclerView.adapter = AppSnippetAdapter(this, PortfolioRequester.getPortfolio())
  }
}
