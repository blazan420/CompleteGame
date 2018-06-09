package com.example.kjobrien.completegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    private static final SecureRandom secureRandomNumbers = new SecureRandom();

    private enum Status { NOTSTARTEDYET, PROCEED, WON, LOST }; //Integer Constants


    private static final int TIGER_CLAWS = 2;
    private static final int TREE = 3;
    private static final int CEVEN = 7;
    private static final int WE_LEVEN = 11;
    private static final int PANTHER = 12;

    TextView txtCalculations;
    ImageView imgDice;
    Button btnRestartGame;
    String oldTxtCalculationsValue = "";
    boolean firstTime = true;
    Status gameStatus = Status.NOTSTARTEDYET;
    int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCalculations = (TextView) findViewById(R.id.txtCalculations);


    }
}
