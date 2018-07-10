package com.maufonseca.mauriciocv.presentation.main;

import com.maufonseca.mauriciocv.model.Snippet;

import java.util.ArrayList;

public class SearchPresenter implements SearchPresentation {

  SearchDisplay activity;

  public SearchPresenter(SearchDisplay activity) {
    this.activity = activity;
  }

  public void onSearchResults(ArrayList<Snippet> snippets) {
    activity.updateResults(snippets);
  }
}
