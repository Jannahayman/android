package com.example.mycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mReset;
    private Button maddOne;
    private Button maddTwo;
    private Button maddThree;
    private Button maddOne2;
    private Button maddTwo2;
    private Button maddThree2;
    private TextView mscoreA;
    private TextView mscoreB;
    private int aScoreCount = 0;
    private int bScoreCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        initializeListeners();
    }
    private void initializeViews() {
        mReset = findViewById(R.id.reset_btn);
        maddOne = findViewById(R.id.btn_add1);
        maddTwo = findViewById(R.id.btn_add2);
        maddThree = findViewById(R.id.btn_add3);
        maddOne2 = findViewById(R.id.btn_add12);
        maddTwo2 = findViewById(R.id.btn_add22);
        maddThree2 = findViewById(R.id.btn_add32);
        mscoreA = findViewById(R.id.scorea);
        mscoreB = findViewById(R.id.scoreb);
    }

    private void initializeListeners() {
        mReset.setOnClickListener(this);
        maddOne.setOnClickListener(this);
        maddTwo.setOnClickListener(this);
        maddThree.setOnClickListener(this);
        maddOne2.setOnClickListener(this);
        maddTwo2.setOnClickListener(this);
        maddThree2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // Team A buttons
        if(aScoreCount < 40 && bScoreCount < 40) {
            if (view.getId() == R.id.btn_add1) {
                aScoreCount += 1;
                mscoreA.setText("" + aScoreCount);
            } else if (view.getId() == R.id.btn_add2) {
                aScoreCount += 2;
                mscoreA.setText("" + aScoreCount);
            } else if (view.getId() == R.id.btn_add3) {
                aScoreCount += 3;
                mscoreA.setText("" + aScoreCount);
            }
            // Team B buttons
            else if (view.getId() == R.id.btn_add12) {
                bScoreCount += 1;
                mscoreB.setText("" + bScoreCount);
            } else if (view.getId() == R.id.btn_add22) {
                bScoreCount += 2;
                mscoreB.setText("" + bScoreCount);
            } else if (view.getId() == R.id.btn_add32) {
                bScoreCount += 3;
                mscoreB.setText("" + bScoreCount);
            }
            // RReset button
            else if (view.getId() == R.id.reset_btn) {
                bScoreCount = 0;
                aScoreCount = 0;
                mscoreB.setText("0");
                mscoreA.setText("0");

            }
        }
        else
        {
            if(aScoreCount >= 40)
                openSecond("Team A");
            else if(bScoreCount >= 40)
                openSecond("Team B");
        }
    }

    private void openSecond(String message) {
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra("key", message);
        startActivity(intent);
    }



}