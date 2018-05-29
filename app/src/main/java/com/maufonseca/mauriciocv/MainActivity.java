package com.maufonseca.mauriciocv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  LinearLayout synthesisLayout, workLayout, schoolLayout, complementLayout, contactLayout;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    synthesisLayout = findViewById(R.id.include_synthesis);
    workLayout = findViewById(R.id.include_work);
    schoolLayout = findViewById(R.id.include_school);
    complementLayout = findViewById(R.id.include_complement);
    contactLayout = findViewById(R.id.include_contact);

    TextView email = findViewById(R.id.email_textview);
    email.setText(Html.fromHtml("<a href=\"mailto:maubfon@gmail.com\">E-mail: maubfon@gmail.com</a>"));
    email.setMovementMethod(LinkMovementMethod.getInstance());
    TextView github = findViewById(R.id.github_textview);
    github.setText(Html.fromHtml("<a href=\"http://github.com/maufonseca\">GitHub: /maufonseca</a>"));
    github.setMovementMethod(LinkMovementMethod.getInstance());
  }

  public void synthesisClicked(View v) {
    synthesisLayout.setVisibility(View.VISIBLE);
    workLayout.setVisibility(View.GONE);
    schoolLayout.setVisibility(View.GONE);
    complementLayout.setVisibility(View.GONE);
    contactLayout.setVisibility(View.GONE);
  }
  public void workClicked(View v) {
    synthesisLayout.setVisibility(View.GONE);
    workLayout.setVisibility(View.VISIBLE);
    schoolLayout.setVisibility(View.GONE);
    complementLayout.setVisibility(View.GONE);
    contactLayout.setVisibility(View.GONE);
  }
  public void schoolClicked(View v) {
    synthesisLayout.setVisibility(View.GONE);
    workLayout.setVisibility(View.GONE);
    schoolLayout.setVisibility(View.VISIBLE);
    complementLayout.setVisibility(View.GONE);
    contactLayout.setVisibility(View.GONE);
  }
  public void complementClicked(View v) {
    synthesisLayout.setVisibility(View.GONE);
    workLayout.setVisibility(View.GONE);
    schoolLayout.setVisibility(View.GONE);
    complementLayout.setVisibility(View.VISIBLE);
    contactLayout.setVisibility(View.GONE);
  }
  public void contactClicked(View v) {
    synthesisLayout.setVisibility(View.GONE);
    workLayout.setVisibility(View.GONE);
    schoolLayout.setVisibility(View.GONE);
    complementLayout.setVisibility(View.GONE);
    contactLayout.setVisibility(View.VISIBLE);
  }
}
