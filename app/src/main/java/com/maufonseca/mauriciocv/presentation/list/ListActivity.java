package com.maufonseca.mauriciocv.presentation.list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.maufonseca.mauriciocv.R;
import com.maufonseca.mauriciocv.model.AppSnippet;
import com.maufonseca.mauriciocv.model.Snippet;
import com.maufonseca.mauriciocv.presentation.myapps.AppSnippetAdapter;
import com.maufonseca.mauriciocv.presentation.snippetdetail.SnippetDetailActivity;

public class ListActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list);
    TextView titleView = findViewById(R.id.title_textview);
    titleView.setText(getString(R.string.apps));
    RecyclerView appsRecyclerView = findViewById(R.id.content_recyclerview);
    appsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    appsRecyclerView.setAdapter(new AppSnippetAdapter(this, AppSnippet.getApps()));
    appsRecyclerView.setNestedScrollingEnabled(false);
  }

  public void snippetTouched(View v) {
    Snippet touchedSnippet;
    try { //trying to get snippet injected as view tag
      touchedSnippet = (Snippet) v.getTag();
    } catch (Exception e) {
      touchedSnippet = new Snippet();
    }
    Intent intent = new Intent(this, SnippetDetailActivity.class);
    intent.putExtra( "snippet", touchedSnippet);
    startActivity(intent);

  }

  public void backTouched(View v) {
    finish();
  }
}
