package com.maufonseca.mauriciocv.presentation.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

import com.maufonseca.mauriciocv.infrastructure.SynthesisRequester
import com.maufonseca.mauriciocv.presentation.complement.ComplementActivity
import com.maufonseca.mauriciocv.presentation.contact.ContactActivity
import com.maufonseca.mauriciocv.presentation.development.DevActivity
import com.maufonseca.mauriciocv.R
import com.maufonseca.mauriciocv.model.Snippet
import com.maufonseca.mauriciocv.presentation.list.SnippetAdapter
import com.maufonseca.mauriciocv.presentation.myapps.AppsActivity
import com.maufonseca.mauriciocv.presentation.school.SchoolActivity
import com.maufonseca.mauriciocv.presentation.snippetdetail.SnippetDetailActivity
import com.maufonseca.mauriciocv.presentation.work.WorkActivity

import java.util.ArrayList

class MainActivity : AppCompatActivity(), SearchDisplay {
  var interactor: SearchInteraction? = null
  var snippetRecyclerView: RecyclerView? = null
  var searchView: android.support.v7.widget.SearchView? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    snippetRecyclerView = findViewById(R.id.snippet_recyclerview)
    snippetRecyclerView?.adapter = SnippetAdapter(this, ArrayList())
    snippetRecyclerView?.layoutManager = LinearLayoutManager(this)
    routeScene()
    configureSearchWidget()
    synthesisClicked(null)
  }

  internal fun routeScene() {
    val presenter = SearchPresenter(this)
    interactor = SearchInteractor(presenter)
  }

  fun configureSearchWidget() {
    searchView = findViewById(R.id.search_view)

    searchView?.setOnQueryTextListener(object : android.support.v7.widget.SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(query: String): Boolean {
        return false
      }

      override fun onQueryTextChange(newText: String): Boolean {
        if (newText == "")
          cleanSearch()
        else
          interactor?.search(newText)
        return true
      }
    })
  }

  fun synthesisClicked(v: View?) {
    snippetRecyclerView?.adapter = SnippetAdapter(this, SynthesisRequester.synthesis)
  }

  fun workClicked(v: View) {
    val workIntent = Intent(this, WorkActivity::class.java)
    startActivity(workIntent)
  }

  fun appsClicked(v: View) {
    val appsIntent = Intent(this, AppsActivity::class.java)
    startActivity(appsIntent)
  }

  fun schoolClicked(v: View) {
    val schoolIntent = Intent(this, SchoolActivity::class.java)
    startActivity(schoolIntent)
  }

  fun complementClicked(v: View) {
    val complementIntent = Intent(this, ComplementActivity::class.java)
    startActivity(complementIntent)
  }

  fun contactClicked(v: View) {
    val contactIntent = Intent(this, ContactActivity::class.java)
    startActivity(contactIntent)
  }

  fun devClicked(v: View) {
    val devIntent = Intent(this, DevActivity::class.java)
    startActivity(devIntent)
  }

  fun shareClicked(v: View) {
    //share the app
    val text = "Desenvolvendo projetos Android/iOS? Baixe meu aplicativo/currículo e conheça meu trabalho: https://play.google.com/store/apps/details?id=com.maufonseca.mauriciocv"
    val emailIntent = Intent(android.content.Intent.ACTION_SEND)
    emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Mauricio CV")
    emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, text)
    emailIntent.type = "text/plain"
    startActivity(Intent.createChooser(emailIntent, "Compartilhar usando: "))
  }

  fun snippetTouched(v: View) {
    var touchedSnippet: Snippet
    try { //trying to get snippet injected as view tag
      touchedSnippet = v.tag as Snippet
    } catch (e: Exception) {
      touchedSnippet = Snippet()
    }

    val intent = Intent(this, SnippetDetailActivity::class.java)
    intent.putExtra("snippet", touchedSnippet)
    startActivity(intent)

  }

  internal fun cleanSearch() {
    snippetRecyclerView?.adapter = SnippetAdapter(this, SynthesisRequester.synthesis)
  }

  override fun updateResults(snippets: ArrayList<Snippet>) {
    snippetRecyclerView?.adapter = SnippetAdapter(this, snippets)
  }

}
