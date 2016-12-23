package com.example.android.courtcounter;

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

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the 3 Points button is clicked.
     */
    public void threePoints(View view) {
        displayForTeamA(3);
    }

    /**
     * This method is called when the 2 Points button is clicked.
     */
    public void twoPoints(View view) {
        displayForTeamA(2);
    }

    /**
     * This method is called when the Free Throw button is clicked.
     */
    public void freeThrow(View view) {
        displayForTeamA(1);
    }
}
