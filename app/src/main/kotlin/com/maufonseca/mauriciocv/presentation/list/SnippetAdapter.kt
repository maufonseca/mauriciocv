package com.maufonseca.mauriciocv.presentation.list

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

import com.maufonseca.mauriciocv.R
import com.maufonseca.mauriciocv.model.Snippet
import com.maufonseca.mauriciocv.presentation.list.SnippetAdapter.ViewHolder

import java.util.ArrayList

class SnippetAdapter(private val context: Context, private val snippetList: ArrayList<Snippet>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    val v = LayoutInflater.from(parent.context).inflate(R.layout.cell_snippet, parent, false)
    return ViewHolder(v)
  }

  override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    bindCellViewHolder(holder as ViewHolder, position)
  }

  fun bindCellViewHolder(holder: ViewHolder, index: Int) {
    holder.cellLayout.tag = snippetList[index]
    if (index % 2 == 0)
      holder.cellLayout.background = ContextCompat.getDrawable(context, R.drawable.ripple_grey_to_grey)
    else
      holder.cellLayout.background = ContextCompat.getDrawable(context, R.drawable.ripple_white_to_grey)
    if (snippetList[index].title!!.isEmpty()) {
      holder.titleTextView.visibility = View.GONE
    } else {
      holder.titleTextView.text = snippetList[index].title
      holder.titleTextView.visibility = View.VISIBLE
    }

    if (snippetList[index].subtitle!!.isEmpty()) {
      holder.subtitleTextView.visibility = View.GONE
    } else {
      holder.subtitleTextView.text = snippetList[index].subtitle
      holder.subtitleTextView.visibility = View.VISIBLE
    }

    if (snippetList[index].shortDescription!!.isEmpty()) {
      holder.shortDescriptionTextView.visibility = View.GONE
    } else {
      holder.shortDescriptionTextView.text = snippetList[index].shortDescription
      holder.shortDescriptionTextView.visibility = View.VISIBLE
    }
  }

  override fun getItemCount(): Int {
    return snippetList.size
  }


  class ViewHolder internal constructor(v: View) : RecyclerView.ViewHolder(v) {
    internal var titleTextView: TextView
    internal var subtitleTextView: TextView
    internal var shortDescriptionTextView: TextView
    internal var cellLayout: LinearLayout

    init {
      cellLayout = v.findViewById(R.id.cell_layout)
      titleTextView = v.findViewById(R.id.title_textview)
      subtitleTextView = v.findViewById(R.id.subtitle_textview)
      shortDescriptionTextView = v.findViewById(R.id.short_description_textview)
    }
  }
}