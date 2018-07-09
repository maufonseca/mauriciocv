package com.maufonseca.mauriciocv.presentation.list;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.maufonseca.mauriciocv.R;
import com.maufonseca.mauriciocv.model.Snippet;

import java.util.ArrayList;

public class SnippetAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
  private ArrayList<Snippet> snippetList;
  private Context context;


  public SnippetAdapter(Context context, ArrayList<Snippet> snippets) {
    snippetList = snippets;
    this.context = context;
  }

  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_snippet, parent, false);
    ViewHolder vh = new ViewHolder(v);
    return vh;
  }

  @Override
  public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    bindCellViewHolder((ViewHolder) holder, position);
  }

  public void bindCellViewHolder(ViewHolder holder, int index) {
    holder.cellLayout.setTag(snippetList.get(index));
    if(index%2==0) holder.cellLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_grey_to_grey));
    else holder.cellLayout.setBackground(ContextCompat.getDrawable(context, R.drawable.ripple_white_to_grey));
    if(snippetList.get(index).getTitle().isEmpty()) {
      holder.titleTextView.setVisibility(View.GONE);
    } else {
      holder.titleTextView.setText(snippetList.get(index).getTitle());
      holder.titleTextView.setVisibility(View.VISIBLE);
    }

    if(snippetList.get(index).getSubtitle().isEmpty()) {
      holder.subtitleTextView.setVisibility(View.GONE);
    } else {
      holder.subtitleTextView.setText(snippetList.get(index).getSubtitle());
      holder.subtitleTextView.setVisibility(View.VISIBLE);
    }

    if(snippetList.get(index).getShortDescription().isEmpty()) {
      holder.shortDescriptionTextView.setVisibility(View.GONE);
    } else {
      holder.shortDescriptionTextView.setText(snippetList.get(index).getShortDescription());
      holder.shortDescriptionTextView.setVisibility(View.VISIBLE);
    }
  }

  @Override
  public int getItemCount() {
    return snippetList.size();
  }


  public static class ViewHolder extends RecyclerView.ViewHolder {
    TextView titleTextView, subtitleTextView, shortDescriptionTextView;
    LinearLayout cellLayout;
    ViewHolder(View v) {
      super(v);
      cellLayout = v.findViewById(R.id.cell_layout);
      titleTextView = v.findViewById(R.id.title_textview);
      subtitleTextView = v.findViewById(R.id.subtitle_textview);
      shortDescriptionTextView = v.findViewById(R.id.short_description_textview);
    }
  }
}