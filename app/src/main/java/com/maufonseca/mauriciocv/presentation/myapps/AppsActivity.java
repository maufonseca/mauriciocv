package com.maufonseca.mauriciocv.presentation.myapps;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.maufonseca.mauriciocv.R;
import com.maufonseca.mauriciocv.model.AppSnippet;
import com.maufonseca.mauriciocv.presentation.list.ListActivity;

public class AppsActivity extends ListActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TextView titleView = findViewById(R.id.title_textview);
    titleView.setText(getString(R.string.apps));
    RecyclerView appsRecyclerView = findViewById(R.id.content_recyclerview);
    appsRecyclerView.setAdapter(new AppSnippetAdapter(this, AppSnippet.getApps()));
  }
}
