package com.maufonseca.mauriciocv.presentation.snippetdetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.maufonseca.mauriciocv.R;
import com.maufonseca.mauriciocv.model.Snippet;

public class SnippetDetailActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_snippet_detail);

    Snippet currentSnippet = getIntent().getParcelableExtra("snippet");
    TextView titleView = findViewById(R.id.title_textview);
    TextView bodyView = findViewById(R.id.body_textview);
    titleView.setText(currentSnippet.getTitle());
    bodyView.setText(currentSnippet.getShortDescription());

  }

  public void backTouched(View v) {
    finish();
  }
}
