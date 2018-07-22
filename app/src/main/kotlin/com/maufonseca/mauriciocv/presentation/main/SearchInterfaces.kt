package com.maufonseca.mauriciocv.presentation.main

import com.maufonseca.mauriciocv.model.Snippet

import java.util.ArrayList

interface SearchDisplay {
  fun updateResults(snippets: ArrayList<Snippet>)
}

interface SearchInteraction {
  fun search(query: String)
}

interface SearchPresentation {
  fun onSearchResults(snippets: ArrayList<Snippet>)
}


