package com.maufonseca.mauriciocv.presentation.myapps

import android.content.Context
import android.os.Build
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.text.Html
import android.text.Html.FROM_HTML_MODE_COMPACT
import android.text.method.LinkMovementMethod
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

import com.maufonseca.mauriciocv.R
import com.maufonseca.mauriciocv.model.AppSnippet
import com.maufonseca.mauriciocv.model.Snippet
import com.maufonseca.mauriciocv.presentation.myapps.AppSnippetAdapter.ViewHolder

import java.util.ArrayList

class AppSnippetAdapter(private val context: Context, private val snippetList: ArrayList<AppSnippet>) : RecyclerView.Adapter<AppSnippetAdapter.ViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val v = LayoutInflater.from(parent.context).inflate(R.layout.cell_app_snippet, parent, false)
    return ViewHolder(v)
  }

  @SuppressWarnings("deprecation")
  override fun onBindViewHolder(holder: ViewHolder, index: Int) {
    if (index % 2 == 0)
      holder.cellLayout.background = ContextCompat.getDrawable(context, R.drawable.ripple_grey_to_grey)
    else
      holder.cellLayout.background = ContextCompat.getDrawable(context, R.drawable.ripple_white_to_grey)
    val snippet = snippetList[index]
    if (snippet.title!!.isEmpty()) {
      holder.titleTextView.visibility = View.GONE
    } else {
      holder.titleTextView.text = snippet.title
      holder.titleTextView.visibility = View.VISIBLE
    }

    if (snippet.isAndroidApp) {
      holder.androidLabel.visibility = View.VISIBLE
    } else {
      holder.androidLabel.visibility = View.GONE
    }

    if (snippet.isIosApp) {
      holder.iOSLabel.visibility = View.VISIBLE
    } else {
      holder.iOSLabel.visibility = View.GONE
    }

    if (snippet.subtitle!!.isEmpty()) {
      holder.subtitleTextView.visibility = View.GONE
    } else {
      holder.subtitleTextView.text = snippet.subtitle
      holder.subtitleTextView.visibility = View.VISIBLE
    }

    if (snippet.urlAndroid!!.isEmpty()) {
      holder.playStoreTextView.visibility = View.GONE
    } else {
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        holder.playStoreTextView.text = Html.fromHtml(snippet.htmlUrlAndroid, FROM_HTML_MODE_COMPACT)
      } else {
        holder.playStoreTextView.text = Html.fromHtml(snippet.htmlUrlAndroid)
      }
      holder.playStoreTextView.movementMethod = LinkMovementMethod.getInstance()
      holder.playStoreTextView.visibility = View.VISIBLE
    }

    if (snippet.urliOS!!.isEmpty()) {
      holder.iTunesTextView.visibility = View.GONE
    } else {
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        holder.iTunesTextView.text = Html.fromHtml(snippet.htmlUrliOS, FROM_HTML_MODE_COMPACT)
      } else {
        holder.iTunesTextView.text = Html.fromHtml(snippet.htmlUrliOS)
      }
      holder.iTunesTextView.movementMethod = LinkMovementMethod.getInstance()
      holder.iTunesTextView.visibility = View.VISIBLE
    }

    if (snippet.shortDescription.isEmpty()) {
      holder.shortDescriptionTextView.visibility = View.GONE
    } else {
      holder.shortDescriptionTextView.text = snippet.shortDescription
      holder.shortDescriptionTextView.visibility = View.VISIBLE
    }
  }

  override fun getItemCount(): Int {
    return snippetList.size
  }

  class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    var titleTextView: TextView = v.findViewById(R.id.title_textview)
    var subtitleTextView: TextView = v.findViewById(R.id.subtitle_textview)
    var shortDescriptionTextView: TextView = v.findViewById(R.id.short_description_textview)
    var playStoreTextView: TextView = v.findViewById(R.id.playstore_textview)
    var iTunesTextView: TextView = v.findViewById(R.id.itunes_textview)
    var iOSLabel: TextView = v.findViewById(R.id.ios_label)
    var androidLabel: TextView = v.findViewById(R.id.android_label)
    var cellLayout: LinearLayout = v.findViewById(R.id.cell_layout)
  }

}