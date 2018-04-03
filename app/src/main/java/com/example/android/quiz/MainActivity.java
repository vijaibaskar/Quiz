package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int correctAnswers = 0;

    /** This method is called when the @submit button is clicked */

    public void submitAnswers(View view) {
        EditText playerName = findViewById(R.id.player_name);
        String getPlayerName = playerName.getText().toString();
        RadioButton answerOne = findViewById(R.id.q1_a1);
        RadioButton answerTwo = findViewById(R.id.q2_a2);
        RadioButton answerThree = findViewById(R.id.q3_a4);
        RadioButton answerFour = findViewById(R.id.q4_a2);
        RadioButton answerFive = findViewById(R.id.q5_a2);
        RadioButton answerSix = findViewById(R.id.q6_a1);
        RadioButton answerEight = findViewById(R.id.q8_a1);
        RadioButton answerTen = findViewById(R.id.q10_a4);
        boolean getAnswerOne = answerOne.isChecked();
        boolean getAnswerTwo = answerTwo.isChecked();
        boolean getAnswerThree = answerThree.isChecked();
        boolean getAnswerFour = answerFour.isChecked();
        boolean getAnswerFive = answerFive.isChecked();
        boolean getAnswerSix = answerSix.isChecked();
        boolean getAnswerEight = answerEight.isChecked();
        boolean getAnswerTen = answerTen.isChecked();
        CheckBox answerSevenOne = findViewById(R.id.q7_a1);
        CheckBox answerSevenTwo = findViewById(R.id.q7_a2);
        CheckBox answerSevenThree = findViewById(R.id.q7_a3);
        CheckBox answerSevenFour = findViewById(R.id.q7_a4);
        boolean getAnswerSevenOne = answerSevenOne.isChecked();
        boolean getAnswerSevenTwo = answerSevenTwo.isChecked();
        boolean getAnswerSevenThree = answerSevenThree.isChecked();
        boolean getAnswerSevenFour = answerSevenFour.isChecked();
        EditText answerNine = findViewById(R.id.q9_a);
        String getAnswerNine = answerNine.getText().toString().toLowerCase();
        Log.v("MainActivity.java", "Question 9 response: " + getAnswerNine);
        if (getAnswerOne == true){
            correctAnswers ++;
        }
        if (getAnswerTwo == true){
            correctAnswers ++;
        }
        if (getAnswerThree == true){
            correctAnswers ++;
        }
        if (getAnswerFour == true){
            correctAnswers ++;
        }
        if (getAnswerFive == true){
            correctAnswers ++;
        }
        if (getAnswerSix == true){
            correctAnswers ++;
        }
        if (getAnswerSevenOne == true && getAnswerSevenFour == true){
            if(getAnswerSevenTwo == false && getAnswerSevenThree == false){
                correctAnswers ++;
            }
            else{
                Log.v("MainActivity.java", "Answer to question 7 is incorrect");
            }
        }
        if (getAnswerEight == true){
            correctAnswers ++;
        }
        if (getAnswerNine.contentEquals("tennis")){
            correctAnswers ++;
        }
        if (getAnswerTen == true){
            correctAnswers ++;
        }
        Toast.makeText(getApplicationContext(),"Hello " + getPlayerName + ", your score is " + correctAnswers, Toast.LENGTH_LONG).show();
        correctAnswers = 0;
    }
}
