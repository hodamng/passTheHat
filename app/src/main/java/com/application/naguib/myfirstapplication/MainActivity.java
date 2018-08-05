package com.application.naguib.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?

        RadioButton rb = ((RadioButton) view);
        boolean checked = ((RadioButton) view).isChecked();
        String noOfPlayers = rb.getText().toString();
        Log.println(Log.ASSERT,"Output","The number of players:" + noOfPlayers);
    }

    public void navigate(String value) {

    }



}
