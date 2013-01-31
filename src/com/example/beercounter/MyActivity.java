package com.example.beercounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
  /**
   * Called when the activity is first created.
   */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  public void beerClick(View view) {
    Button button = (Button) view;
    int count = Integer.parseInt(String.valueOf(button.getText()));
    button.setText("" + (count + 1));
  }
}
