package com.application.naguib.myfirstapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Set;

public class Choices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);
        SharedPreferences sharedpreferences = getSharedPreferences("pass_the_hat", Context.MODE_PRIVATE);
        Set<String> set = sharedpreferences.getStringSet("teams", null);
        String item = set.iterator().next();
        TextView ll = (TextView)findViewById(R.id.textView4);
        ll.setText(item);
    }
}
