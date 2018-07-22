package com.maufonseca.mauriciocv.infrastructure

import com.maufonseca.mauriciocv.model.Snippet
import java.util.ArrayList

object SearchEngine {

  fun search(query: String): ArrayList<Snippet> = ArrayList(SynthesisRequester.synthesis.filter { it.matchesQuery(query) } +
        SchoolRequester.school.filter { it.matchesQuery(query) } +
        ComplementRequester.complement.filter { it.matchesQuery(query) } +
        WorkRequester.workHistory.filter { it.matchesQuery(query) } +
        AppsRequester.apps.filter { it.matchesQuery(query) })
}
