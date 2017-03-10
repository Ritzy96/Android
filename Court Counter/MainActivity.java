package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_A=0;
    int score_B=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForA(View view){
        score_A+=3;
        displayForTeamA(score_A);
    }
    public void addThreeForB(View view){
        score_B+=3;
        displayForTeamB(score_B);
    }
    public void addTwoForA(View view){
        score_A+=2;
        displayForTeamA(score_A);
    }
    public void addTwoForB(View view){
        score_B+=2;
        displayForTeamB(score_B);
    }
    public void addOneForA(View view){
        score_A+=1;
        displayForTeamA(score_A);
    }
    public void addOneForB(View view){
        score_B+=1;
        displayForTeamB(score_B);
    }

    public void resetButton(View view){
        score_A=0;
        score_B=0;
        displayForTeamA(score_A);
        displayForTeamB(score_B);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
