package com.maufonseca.mauriciocv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class SnippetAdapter extends RecyclerView.Adapter<SnippetAdapter.ViewHolder> {
  private ArrayList<Snippet> snippetList;

  public static class ViewHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView titleTextView, subtitleTextView, shortDescriptionTextView;
    public ViewHolder(View v) {
      super(v);
      titleTextView = v.findViewById(R.id.title_textview);
      subtitleTextView = v.findViewById(R.id.subtitle_textview);
      shortDescriptionTextView = v.findViewById(R.id.short_description_textview);
    }
  }

  public SnippetAdapter(ArrayList<Snippet> snippets) {
    snippetList = snippets;
  }

  @Override
  public SnippetAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    // create a new view
    View v = LayoutInflater.from(parent.getContext())
      .inflate(R.layout.cell_snippet, parent, false);
    ViewHolder vh = new ViewHolder(v);
    return vh;
  }

  @Override
  public void onBindViewHolder(ViewHolder holder, int position) {
    if(snippetList.get(position).getTitle().isEmpty()) {
      holder.titleTextView.setVisibility(View.GONE);
    } else {
      holder.titleTextView.setText(snippetList.get(position).getTitle());
      holder.titleTextView.setVisibility(View.VISIBLE);
    }

    if(snippetList.get(position).getSubtitle().isEmpty()) {
      holder.subtitleTextView.setVisibility(View.GONE);
    } else {
      holder.subtitleTextView.setText(snippetList.get(position).getSubtitle());
      holder.subtitleTextView.setVisibility(View.VISIBLE);
    }

    if(snippetList.get(position).getShortDescription().isEmpty()) {
      holder.shortDescriptionTextView.setVisibility(View.GONE);
    } else {
      holder.shortDescriptionTextView.setText(snippetList.get(position).getShortDescription());
      holder.shortDescriptionTextView.setVisibility(View.VISIBLE);
    }
  }

  // Return the size of your dataset (invoked by the layout manager)
  @Override
  public int getItemCount() {
    return snippetList.size();
  }
}