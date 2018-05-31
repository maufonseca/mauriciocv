package com.maufonseca.mauriciocv.presentation.myapps;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.maufonseca.mauriciocv.R;
import com.maufonseca.mauriciocv.model.AppSnippet;
import com.maufonseca.mauriciocv.model.Snippet;

import java.util.ArrayList;

public class AppSnippetAdapter extends RecyclerView.Adapter<AppSnippetAdapter.ViewHolder> {
  private ArrayList<AppSnippet> snippetList;

  public static class ViewHolder extends RecyclerView.ViewHolder {
    public TextView titleTextView, subtitleTextView, shortDescriptionTextView, playStoreTextView,
      iTunesTextView, iOSLabel, androidLabel;

    public ViewHolder(View v) {
      super(v);
      titleTextView = v.findViewById(R.id.title_textview);
      iOSLabel = v.findViewById(R.id.ios_label);
      androidLabel = v.findViewById(R.id.android_label);
      subtitleTextView = v.findViewById(R.id.subtitle_textview);
      playStoreTextView = v.findViewById(R.id.playstore_textview);
      iTunesTextView = v.findViewById(R.id.itunes_textview);
      shortDescriptionTextView = v.findViewById(R.id.short_description_textview);
    }
  }

  public AppSnippetAdapter(ArrayList<AppSnippet> snippets) {
    snippetList = snippets;
  }

  @Override
  public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_app_snippet, parent, false);
    ViewHolder vh = new ViewHolder(v);
    return vh;

  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int index) {
    AppSnippet snippet = snippetList.get(index);
    if(snippet.getTitle().isEmpty()) {
      holder.titleTextView.setVisibility(View.GONE);
    } else {
      holder.titleTextView.setText(snippet.getTitle());
      holder.titleTextView.setVisibility(View.VISIBLE);
    }

    if(snippet.isAndroidApp()) {
      holder.androidLabel.setVisibility(View.VISIBLE);
    } else {
      holder.androidLabel.setVisibility(View.GONE);
    }

    if(snippet.isIosApp()) {
      holder.iOSLabel.setVisibility(View.VISIBLE);
    } else {
      holder.iOSLabel.setVisibility(View.GONE);
    }

    if(snippet.getSubtitle().isEmpty()) {
      holder.subtitleTextView.setVisibility(View.GONE);
    } else {
      holder.subtitleTextView.setText(snippet.getSubtitle());
      holder.subtitleTextView.setVisibility(View.VISIBLE);
    }

    if(snippet.getUrlAndroid().isEmpty()) {
      holder.playStoreTextView.setVisibility(View.GONE);
    } else {
      holder.playStoreTextView.setText(Html.fromHtml(snippet.getHtmlUrlAndroid()));
      holder.playStoreTextView.setMovementMethod(LinkMovementMethod.getInstance());
      holder.playStoreTextView.setVisibility(View.VISIBLE);
    }

    if(snippet.getUrliOS().isEmpty()) {
      holder.iTunesTextView.setVisibility(View.GONE);
    } else {
      holder.iTunesTextView.setText(Html.fromHtml(snippet.getHtmlUrliOS()));
      holder.iTunesTextView.setMovementMethod(LinkMovementMethod.getInstance());
      holder.iTunesTextView.setVisibility(View.VISIBLE);
    }

    if(snippet.getShortDescription().isEmpty()) {
      holder.shortDescriptionTextView.setVisibility(View.GONE);
    } else {
      holder.shortDescriptionTextView.setText(snippet.getShortDescription());
      holder.shortDescriptionTextView.setVisibility(View.VISIBLE);
    }
  }

  @Override
  public int getItemCount() {
    return snippetList.size();
  }

}