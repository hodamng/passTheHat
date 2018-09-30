package com.application.naguib.myfirstapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class TeamNames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_names);
        EditText editText = (EditText) findViewById(R.id.editText3);
        Integer value = 0;
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            value =  extras.getInt("com.passthehat.teamnumber.MESSAGE");
        }

        editText.setText(value.toString());

    }

}
