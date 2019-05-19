package com.application.naguib.myfirstapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import com.application.naguib.myfirstapplication.ui.teaminput.TeamInputFragment;

import java.util.Set;

public class TeamInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_input_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, TeamInputFragment.newInstance())
                    .commitNow();
        }

        SharedPreferences sharedpreferences = getSharedPreferences("pass_the_hat", Context.MODE_PRIVATE);
        Set<String> set = sharedpreferences.getStringSet("teams", null);
        String item = set.iterator().next();

        //TODO: get the fragment first
        // then get the text view from there. or we can use view model
//        TeamInputFragment frag = (TeamInputFragment)getSupportFragmentManager().
//                findFragmentById(R.id.container);
//        frag.updateText7(item);

    }

}
