package com.maufonseca.mauriciocv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AppsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_apps);
    TextView titleView = findViewById(R.id.title_textview);
    titleView.setText(getString(R.string.apps));
  }

  public void finishClicked(View v) {
    finish();
  }
}
