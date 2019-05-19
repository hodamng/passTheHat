package com.application.naguib.myfirstapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.ArraySet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.Set;

public class TeamNames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_names);
        Integer value = 0;
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            value = extras.getInt("com.passthehat.teamnumber.MESSAGE");
            LinearLayout ll = (LinearLayout) findViewById(R.id.team_name_layout);
            for (int numberOfLines = 0; numberOfLines < (value / 2); numberOfLines++) {// add edittext
                EditText et = new EditText(this);
                LinearLayout.LayoutParams p = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                et.setLayoutParams(p);
                et.setHint(String.format("Team %d name", numberOfLines+1));
                et.setId(numberOfLines + 1);
                ll.addView(et);
            }


        }


    }

    public void onButtonClicked(View view) {
        SharedPreferences sharedpreferences = getSharedPreferences("pass_the_hat", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedpreferences.edit();
        Set<String> set = new ArraySet<String>();
        LinearLayout ll = (LinearLayout) findViewById(R.id.team_name_layout);

        for(int i = 0; i < ll.getChildCount(); i++) {
            EditText et = (EditText)ll.getChildAt(i);
            set.add(et.getText().toString());
        }


        editor.putStringSet("teams", set);

        editor.putString("current_team", ((EditText)ll.getChildAt(0)).getText().toString());
        editor.putInt("c", 1);
        editor.commit();

        Intent intent = new Intent(this, TeamInput.class);
        startActivity(intent);

    }


}
