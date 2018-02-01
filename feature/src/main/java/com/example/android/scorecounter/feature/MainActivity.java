package com.example.android.scorecounter.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score_A = 0, score_B = 0;

    public void displayScoreA(String msg) {
        TextView score_of_A = findViewById(R.id.scoreA);
        score_of_A.setText(msg);
    }

    public void displayScoreB(String msg) {
        TextView score_of_B = findViewById(R.id.scoreB);
        score_of_B.setText(msg);
    }

    public void plusthree(View view) {
        score_A += 3;
        String msg = "" + score_A;
        displayScoreA(msg);
    }

    public void plustwo(View view) {
        score_A += 2;
        String msg = "" + score_A;
        displayScoreA(msg);
    }

    public void freeThrow(View view) {
        score_A++;
        String msg = "" + score_A;
        displayScoreA(msg);
    }

    public void plusthreeB(View view) {
        score_B += 3;
        String msg = "" + score_B;
        displayScoreB(msg);
    }

    public void plustwoB(View view) {
        score_B += 2;
        String msg = "" + score_B;
        displayScoreB(msg);
    }

    public void freeThrowB(View view) {
        score_B++;
        String msg = "" + score_B;
        displayScoreB(msg);
    }

    public void reset(View view) {
        score_A = 0;
        String msg = "" + score_A;
        displayScoreA(msg);
        score_B = 0;
        msg = "" + score_B;
        displayScoreB(msg);
    }
}
