package com.application.naguib.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
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
        int value = Integer.parseInt(((RadioButton) view).getText().toString());
        String noOfPlayers = rb.getText().toString();
        Log.println(Log.ASSERT, "Output", "The number of players:" + noOfPlayers);

        Intent intent = new Intent(this, TeamNames.class);
        intent.putExtra("com.passthehat.teamnumber.MESSAGE", value);
        startActivity(intent);
    }

    public void navigate(String value) {

    }


}
