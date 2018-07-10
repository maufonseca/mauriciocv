package com.maufonseca.mauriciocv.infrastructure;

import com.maufonseca.mauriciocv.model.AppSnippet;
import com.maufonseca.mauriciocv.model.Snippet;

import java.util.ArrayList;

public class SearchEngine {

  public static ArrayList<Snippet> search(String query) {
    ArrayList<Snippet> response = new ArrayList<>();

    for (Snippet snippet : SynthesisRequester.getSynthesis()) {
      if(snippet.matchesQuery(query)) {
        response.add(snippet);
      }
    }

    for (Snippet snippet : SchoolRequester.getSchool()) {
      if(snippet.matchesQuery(query)) {
        response.add(snippet);
      }
    }

    for (Snippet snippet : ComplementRequester.getComplement()) {
      if(snippet.matchesQuery(query)) {
        response.add(snippet);
      }
    }

    for (Snippet snippet : WorkRequester.getWorkHistory()) {
      if(snippet.matchesQuery(query)) {
        response.add(snippet);
      }
    }

    for (Snippet snippet : AppsRequester.getApps()) {
      if(snippet.matchesQuery(query)) {
        response.add(snippet);
      }
    }

    return response;
  }
}
