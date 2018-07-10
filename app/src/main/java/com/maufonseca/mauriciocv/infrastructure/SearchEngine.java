package com.maufonseca.mauriciocv.infrastructure;

import com.maufonseca.mauriciocv.model.AppSnippet;
import com.maufonseca.mauriciocv.model.Snippet;

import java.util.ArrayList;

public class SearchEngine {

  public static ArrayList<Snippet> search(String query) {
    ArrayList<Snippet> response = new ArrayList<>();

    for (Snippet snippet : Snippet.getSynthesis()) {
      if(snippet.matchesQuery(query)) {
        response.add(snippet);
      }
    }

    for (Snippet snippet : Snippet.getSchool()) {
      if(snippet.matchesQuery(query)) {
        response.add(snippet);
      }
    }

    for (Snippet snippet : Snippet.getComplement()) {
      if(snippet.matchesQuery(query)) {
        response.add(snippet);
      }
    }

    for (Snippet snippet : WorkHistoryRequester.getWorkHistory()) {
      if(snippet.matchesQuery(query)) {
        response.add(snippet);
      }
    }

    for (Snippet snippet : AppSnippet.getApps()) {
      if(snippet.matchesQuery(query)) {
        response.add(snippet);
      }
    }

    return response;
  }
}
