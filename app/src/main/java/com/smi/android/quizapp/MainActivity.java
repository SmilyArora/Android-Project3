package com.smi.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.id;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.smi.android.quizapp.R.string.q5;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    void submit(View view){
        RadioButton rb1 = (RadioButton) findViewById(R.id.q1_ans);
        RadioButton rb2 = (RadioButton) findViewById(R.id.q2_ans);
        RadioButton rb3 = (RadioButton) findViewById(R.id.q3_ans);
        RadioButton rb4 = (RadioButton) findViewById(R.id.q4_ans);
        CheckBox cb1 = (CheckBox) findViewById(R.id.q5_ans1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.q5_ans2);
        CheckBox cb3 = (CheckBox) findViewById(R.id.q5_3);
        CheckBox cb4 = (CheckBox) findViewById(R.id.q5_4);

        int score =0;

        if(rb1.isChecked()){
            score++;
        }
        if(rb2.isChecked()){
            score++;
        }
        if(rb3.isChecked()){
            score++;
        }
        if(rb4.isChecked()){
            score++;
        }
        if(cb1.isChecked() && cb2.isChecked() && !cb3.isChecked() && !cb4.isChecked() ){
            score++;
        }
        EditText ed = (EditText) findViewById(R.id.name);
        Toast.makeText(this, "Test score for User " + ed.getText().toString().trim() + " is:" + score +"/5",Toast.LENGTH_LONG).show();
    }
}
