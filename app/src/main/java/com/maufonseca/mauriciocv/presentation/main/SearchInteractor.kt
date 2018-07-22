package com.maufonseca.mauriciocv.presentation.main

import com.maufonseca.mauriciocv.infrastructure.SearchEngine

class SearchInteractor(var presenter: SearchPresentation) : SearchInteraction {

  override fun search(query: String) {
    presenter.onSearchResults(SearchEngine.search(query))
  }
}
