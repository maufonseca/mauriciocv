package com.maufonseca.mauriciocv.presentation.main;

import com.maufonseca.mauriciocv.infrastructure.SearchEngine;

public class SearchInteractor implements SearchInteraction{

  SearchPresentation presenter;

  public SearchInteractor(SearchPresentation presenter) {
    this.presenter = presenter;
  }

  public void search(String query) {
      presenter.onSearchResults(SearchEngine.search(query));
  }
}
