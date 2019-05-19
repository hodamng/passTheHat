package com.application.naguib.myfirstapplication.ui.teaminput;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.application.naguib.myfirstapplication.R;

import java.util.Set;

public class TeamInputFragment extends Fragment {

    private TeamInputViewModel mViewModel;

    public static TeamInputFragment newInstance() {
        return new TeamInputFragment();
    }

    TextView mTextView7;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        SharedPreferences sharedpreferences = this.getActivity().getSharedPreferences("pass_the_hat", Context.MODE_PRIVATE);
        Set<String> set = sharedpreferences.getStringSet("teams", null);
        String item = set.iterator().next();

        View view = inflater.inflate(R.layout.team_input_fragment, container, false);
        mTextView7 = (TextView) view.findViewById(R.id.textView7);
        mTextView7.setText(item);

        Integer current_member = sharedpreferences.getInt("current_team_member", 1);
        TextView tv = (TextView) view.findViewById(R.id.team_member);
        tv.setText("Player " + current_member.toString());

        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putInt("current_team_member", current_member++);
        editor.apply();

        current_member = sharedpreferences.getInt("current_team_member", 1);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TeamInputViewModel.class);
        // TODO: Use the ViewModel

    }

}
