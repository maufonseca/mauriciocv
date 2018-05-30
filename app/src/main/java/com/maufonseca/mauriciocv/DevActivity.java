package com.maufonseca.mauriciocv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DevActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dev);
    TextView titleView = findViewById(R.id.title_textview);
    titleView.setText(getString(R.string.about));
  }

  public void finishClicked(View v) {
    finish();
  }
}
