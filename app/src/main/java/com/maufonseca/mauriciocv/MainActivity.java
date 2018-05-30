package com.maufonseca.mauriciocv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  LinearLayout contactLayout;
  RecyclerView snippetRecyclerView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    snippetRecyclerView = findViewById(R.id.snippet_recyclerview);
    contactLayout = findViewById(R.id.include_contact);

    snippetRecyclerView.setAdapter(new SnippetAdapter(new ArrayList<Snippet>()));
    snippetRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    TextView email = findViewById(R.id.email_textview);
    email.setText(Html.fromHtml("<a href=\"mailto:maubfon@gmail.com\">E-mail: maubfon@gmail.com</a>"));
    email.setMovementMethod(LinkMovementMethod.getInstance());
    TextView github = findViewById(R.id.github_textview);
    github.setText(Html.fromHtml("<a href=\"http://github.com/maufonseca\">GitHub: /maufonseca</a>"));
    github.setMovementMethod(LinkMovementMethod.getInstance());

    synthesisClicked(null);
  }

  public void synthesisClicked(View v) {
    snippetRecyclerView.setAdapter(new SnippetAdapter(Snippet.getSynthesis()));
    snippetRecyclerView.setVisibility(View.VISIBLE);
    contactLayout.setVisibility(View.GONE);
  }
  public void workClicked(View v) {
    snippetRecyclerView.setAdapter(new SnippetAdapter(Snippet.getWorkHistory()));
    snippetRecyclerView.setVisibility(View.VISIBLE);
    contactLayout.setVisibility(View.GONE);
  }
  public void appsClicked(View v) {
  }
  public void schoolClicked(View v) {
    snippetRecyclerView.setAdapter(new SnippetAdapter(Snippet.getSchool()));
    snippetRecyclerView.setVisibility(View.VISIBLE);
    contactLayout.setVisibility(View.GONE);
  }
  public void complementClicked(View v) {
    snippetRecyclerView.setAdapter(new SnippetAdapter(Snippet.getComplement()));
    snippetRecyclerView.setVisibility(View.VISIBLE);
    contactLayout.setVisibility(View.GONE);
  }
  public void contactClicked(View v) {
    snippetRecyclerView.setVisibility(View.GONE);
    contactLayout.setVisibility(View.VISIBLE);
  }
  public void devClicked(View v) {
  }
  public void printClicked(View v) {
  }
  public void shareClicked(View v) {
  }
}
