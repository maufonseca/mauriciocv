package com.maufonseca.mauriciocv.presentation.development;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.maufonseca.mauriciocv.R;

public class DevActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dev);
    TextView titleView = findViewById(R.id.title_textview);
    titleView.setText(getString(R.string.about));
    TextView email = findViewById(R.id.email_textview);
    email.setText(Html.fromHtml("<a href=\"mailto:maubfon@gmail.com\">maubfon@gmail.com</a>"));
    email.setMovementMethod(LinkMovementMethod.getInstance());
    TextView github = findViewById(R.id.github_textview);
    github.setText(Html.fromHtml("<a href=\"http://github.com/maufonseca/mauriciocv\">github.com/maufonseca/mauriciocv</a>"));
    github.setMovementMethod(LinkMovementMethod.getInstance());
    TextView playstore = findViewById(R.id.link_textview);
    playstore.setText(Html.fromHtml("<a href=\"https://play.google.com/store/apps/details?id=com.maufonseca.mauriciocv\">avaliar aplicativo</a>"));
    playstore.setMovementMethod(LinkMovementMethod.getInstance());
  }

  public void backTouched(View v) {
    finish();
  }
}
