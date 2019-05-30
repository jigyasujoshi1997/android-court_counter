package com.example.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);
    }

    public void score3(View v) {
        displayForTeamA(scoreA += 3);
    }

    public void score2(View v) {
        displayForTeamA(scoreA  +=2);
    }

    public void scorefree(View v) {
        displayForTeamA(scoreA +=1);
    }

    public void displayForTeamA (int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void score3B(View v) {
        displayForTeamB(scoreB += 3);
    }

    public void score2B(View v) {
        displayForTeamB(scoreB  +=2);
    }

    public void scorefreeB(View v) {
        displayForTeamB(scoreB +=1);
    }

    public void displayForTeamB (int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
    }
