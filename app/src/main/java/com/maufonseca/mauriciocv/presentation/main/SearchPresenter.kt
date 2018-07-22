package com.maufonseca.mauriciocv.presentation.main

import com.maufonseca.mauriciocv.model.Snippet

import java.util.ArrayList

class SearchPresenter(var activity: SearchDisplay) : SearchPresentation {

  override fun onSearchResults(snippets: ArrayList<Snippet>) {
    activity.updateResults(snippets)
  }
}
