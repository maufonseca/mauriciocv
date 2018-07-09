package com.maufonseca.mauriciocv.presentation.complement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.maufonseca.mauriciocv.R;
import com.maufonseca.mauriciocv.infrastructure.WorkHistoryRequester;
import com.maufonseca.mauriciocv.model.Snippet;
import com.maufonseca.mauriciocv.presentation.list.ListActivity;
import com.maufonseca.mauriciocv.presentation.list.SnippetAdapter;

public class ComplementActivity extends ListActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TextView titleView = findViewById(R.id.title_textview);
    titleView.setText(getString(R.string.complementary_activities));
    RecyclerView appsRecyclerView = findViewById(R.id.content_recyclerview);
    appsRecyclerView.setAdapter(new SnippetAdapter(this, Snippet.getComplement()));
  }
}
