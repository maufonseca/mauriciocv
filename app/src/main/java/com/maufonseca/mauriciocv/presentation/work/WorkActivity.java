package com.maufonseca.mauriciocv.presentation.work;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.maufonseca.mauriciocv.R;
import com.maufonseca.mauriciocv.infrastructure.WorkRequester;
import com.maufonseca.mauriciocv.presentation.list.ListActivity;
import com.maufonseca.mauriciocv.presentation.list.SnippetAdapter;

public class WorkActivity extends ListActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TextView titleView = findViewById(R.id.title_textview);
    titleView.setText(getString(R.string.work_history));
    RecyclerView appsRecyclerView = findViewById(R.id.content_recyclerview);
    appsRecyclerView.setAdapter(new SnippetAdapter(this, WorkRequester.getWorkHistory()));
  }
}
