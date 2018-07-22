package com.maufonseca.mauriciocv.presentation.list

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

import com.maufonseca.mauriciocv.R
import com.maufonseca.mauriciocv.model.Snippet
import com.maufonseca.mauriciocv.presentation.portfolio.AppSnippetAdapter
import com.maufonseca.mauriciocv.presentation.snippetdetail.SnippetDetailActivity

import java.util.ArrayList

open class ListActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_list)
    val appsRecyclerView = findViewById<RecyclerView>(R.id.content_recyclerview)
    appsRecyclerView.layoutManager = LinearLayoutManager(this)
    appsRecyclerView.adapter = AppSnippetAdapter(this, ArrayList())
  }

  fun setListTitle(title: String) { findViewById<TextView>(R.id.title_textview).text = title }

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

  @Suppress("UNUSED_PARAMETER")
  fun backTouched(v: View) {
    finish()
  }
}
