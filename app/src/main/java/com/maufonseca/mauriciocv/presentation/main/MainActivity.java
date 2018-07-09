package com.maufonseca.mauriciocv.presentation.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.maufonseca.mauriciocv.infrastructure.WorkHistoryRequester;
import com.maufonseca.mauriciocv.presentation.complement.ComplementActivity;
import com.maufonseca.mauriciocv.presentation.contact.ContactActivity;
import com.maufonseca.mauriciocv.presentation.development.DevActivity;
import com.maufonseca.mauriciocv.R;
import com.maufonseca.mauriciocv.model.Snippet;
import com.maufonseca.mauriciocv.presentation.list.ListActivity;
import com.maufonseca.mauriciocv.presentation.list.SnippetAdapter;
import com.maufonseca.mauriciocv.presentation.myapps.AppsActivity;
import com.maufonseca.mauriciocv.presentation.school.SchoolActivity;
import com.maufonseca.mauriciocv.presentation.snippetdetail.SnippetDetailActivity;
import com.maufonseca.mauriciocv.presentation.work.WorkActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  RecyclerView snippetRecyclerView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    snippetRecyclerView = findViewById(R.id.snippet_recyclerview);
    snippetRecyclerView.setAdapter(new SnippetAdapter(this, new ArrayList<Snippet>()));
    snippetRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    synthesisClicked(null);
  }

  public void synthesisClicked(View v) {
    snippetRecyclerView.setAdapter(new SnippetAdapter(this, Snippet.getSynthesis()));
  }
  public void workClicked(View v) {
    Intent workIntent = new Intent(this, WorkActivity.class);
    startActivity(workIntent);
  }
  public void appsClicked(View v) {
    Intent appsIntent = new Intent(this, AppsActivity.class);
    startActivity(appsIntent);
  }
  public void schoolClicked(View v) {
    Intent schoolIntent = new Intent(this, SchoolActivity.class);
    startActivity(schoolIntent);
  }

  public void complementClicked(View v) {
    Intent complementIntent = new Intent(this, ComplementActivity.class);
    startActivity(complementIntent);
  }
  public void contactClicked(View v) {
    Intent contactIntent = new Intent(this, ContactActivity.class);
    startActivity(contactIntent);
  }
  public void devClicked(View v) {
    Intent devIntent = new Intent(this, DevActivity.class);
    startActivity(devIntent);
  }
  public void shareClicked(View v) {
    //share the app
    String text = "Desenvolvendo projetos Android/iOS? Baixe meu aplicativo/currículo e conheça meu trabalho: https://play.google.com/store/apps/details?id=com.maufonseca.mauriciocv";
    final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
    emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Mauricio CV");
    emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, text);
    emailIntent.setType("text/plain");
    startActivity(Intent.createChooser(emailIntent, "Compartilhar usando: "));
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

}
