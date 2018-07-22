package com.maufonseca.mauriciocv.infrastructure

import com.maufonseca.mauriciocv.model.Snippet
import java.util.ArrayList

object SearchEngine {

  fun search(query: String):
      ArrayList<Snippet> = ArrayList(SynthesisRequester.getSynthesis().filter { it.matchesQuery(query) } +
        SchoolRequester.getSchool().filter { it.matchesQuery(query) } +
        ComplementRequester.getComplement().filter { it.matchesQuery(query) } +
        WorkRequester.getWorkHistory().filter { it.matchesQuery(query) } +
        PortfolioRequester.getPortfolio().filter { it.matchesQuery(query) })
}
