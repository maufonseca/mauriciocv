package com.maufonseca.mauriciocv.presentation.main;

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
  private String title;

  public static class ViewHolder extends RecyclerView.ViewHolder {
    public TextView titleTextView, subtitleTextView, shortDescriptionTextView;
    public LinearLayout cellLayout;
    public ViewHolder(View v) {
      super(v);
      cellLayout = v.findViewById(R.id.cell_layout);
      titleTextView = v.findViewById(R.id.title_textview);
      subtitleTextView = v.findViewById(R.id.subtitle_textview);
      shortDescriptionTextView = v.findViewById(R.id.short_description_textview);
    }
  }

  public static class TitleViewHolder extends RecyclerView.ViewHolder {
    public TextView titleTextView;
    public TitleViewHolder(View v) {
      super(v);
      titleTextView = v.findViewById(R.id.section_textview);

    }
  }

  public SnippetAdapter(String title, ArrayList<Snippet> snippets) {
    snippetList = snippets;
    this.title = title;
  }

  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    if(viewType == 0) {
      View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_title, parent, false);
      TitleViewHolder tvh = new TitleViewHolder(v);
      return tvh;
    } else {
      View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cell_snippet, parent, false);
      ViewHolder vh = new ViewHolder(v);
      return vh;
    }
  }

  @Override
  public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
    if(position == 0) bindHeaderViewHolder((TitleViewHolder) holder);
    else bindCellViewHolder((ViewHolder) holder, position-1);

  }
  public void bindHeaderViewHolder(TitleViewHolder holder) {
    holder.titleTextView.setText(this.title);
  }

  public void bindCellViewHolder(ViewHolder holder, int index) {
    holder.cellLayout.setTag(snippetList.get(index));
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
    return snippetList.size()+1; //+1 for header
  }

  @Override
  public int getItemViewType(int position) {
    //0 is header
    if(position==0) return 0;
    else return 1;
  }
}