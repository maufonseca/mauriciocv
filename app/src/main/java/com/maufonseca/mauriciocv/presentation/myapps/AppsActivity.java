package com.maufonseca.mauriciocv.presentation.myapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.maufonseca.mauriciocv.R;
import com.maufonseca.mauriciocv.model.AppSnippet;

public class AppsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_apps);
    TextView titleView = findViewById(R.id.title_textview);
    titleView.setText(getString(R.string.apps));
    RecyclerView appsRecyclerView = findViewById(R.id.apps_recyclerview);
    appsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    appsRecyclerView.setAdapter(new AppSnippetAdapter(AppSnippet.getApps()));
    appsRecyclerView.setNestedScrollingEnabled(false);
  }

  public void finishClicked(View v) {
    finish();
  }
}
