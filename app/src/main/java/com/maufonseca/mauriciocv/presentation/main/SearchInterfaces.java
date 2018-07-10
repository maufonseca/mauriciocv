package com.maufonseca.mauriciocv.presentation.main;

import com.maufonseca.mauriciocv.model.Snippet;

import java.util.ArrayList;

interface SearchDisplay {
  void updateResults(ArrayList<Snippet> snippets);
}

interface SearchInteraction {
  void search(String query);
}

interface SearchPresentation {
  void onSearchResults(ArrayList<Snippet> snippets);
}


