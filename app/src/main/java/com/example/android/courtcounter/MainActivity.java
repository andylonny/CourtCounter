package com.example.android.courtcounter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.courtcounter.R.string.msg;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

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
    public void addThreeForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the 2 Points button is clicked.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the Free Throw button is clicked.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the 3 Points button is clicked.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the 2 Points button is clicked.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the Free Throw button is clicked.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * This method is called when the -1 point button is clicked.
     */
    public void minusOneForTeamA(View v) {
        if (scoreTeamA == 0) {
            Context context = getApplicationContext();
            CharSequence text = this.getString(R.string.msg);
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return;
        }

        scoreTeamA -= 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the -1 point button is clicked.
     */
    public void minusOneForTeamB(View v) {
        if (scoreTeamB == 0) {
            Context context = getApplicationContext();
            CharSequence text = this.getString(R.string.msg);
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
            return;
        }

        scoreTeamB -= 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
