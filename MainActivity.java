package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalsA=0, cornersA=0, goalsB=0, cornersB=0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
/*This function prints the goals for team A
* */
    public void display1ForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(score));
    }
    
    /*This function prints the corners for team A
* */
    public void display2ForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_corners);
        scoreView.setText(String.valueOf(score));
    }
/* This function increments the number of goals for team A
*
*/
    public void addGoalTeamA(View v) {
        goalsA++;
        display1ForTeamA(goalsA);

    }
    /* This function increments the number of corners for team A
*
*/
    public void addcornerTeamA(View v) {
        cornersA++;
        display2ForTeamA(cornersA);

    }
    /*This function prints the goals for team B
* */
    public void display3ForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(score));
    }
    /*This function prints the corners for team B
* */
    public void display4ForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_corners);
        scoreView.setText(String.valueOf(score));
    }
/* This function increments the number of goals for team B
*
*/

    public void addGoalTeamB(View v) {
        goalsB++;
        display3ForTeamB(goalsB);

    }
    /* This function increments the number of corners for team B
*
*/
    public void addcornerTeamB(View v) {
        cornersB++;
        display4ForTeamB(cornersB);

    }
    /*
    This function resets all the variables to 0
     */
    public void reset(View v) {

        goalsA=goalsB=0;
        cornersA=cornersB=0;
        display1ForTeamA(goalsA);
        display2ForTeamA(cornersA);
        display3ForTeamB(goalsB);
        display4ForTeamB(cornersB);
    }


}
