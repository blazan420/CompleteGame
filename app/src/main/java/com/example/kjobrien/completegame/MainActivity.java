package com.example.kjobrien.completegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        imgDice = (ImageView) findViewById(R.id.imgDice);
        btnRestartGame = (Button) findViewById(R.id.btnRestartTheGame);
        TextView txtGameStatus = (TextView)findViewById(R.id.txtGameStatus);

        makeBtnRestartInvisible();

        txtGameStatus.setText("");
        txtCalculations.setText("");

        imgDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (gameStatus == Status.NOTSTARTEDYET) {

                    int diceSum = letsRollTheDice();

                }

            }
        });





    }

    private void makeImgDiceInvisible() {

        imgDice.setVisibility(View.INVISIBLE);

    }

    private void makeBtnRestartInvisible() {

        btnRestartGame.setVisibility(View.INVISIBLE);

    }

    private void makeImgDiceVisible() {
        imgDice.setVisibility(View.VISIBLE);
    }

    private void makeBtnRestartVisible() {
        btnRestartGame.setVisibility(View.VISIBLE);
    }

    private int letsRollTheDice() {

        int randDie1 = 1 + secureRandomNumbers.nextInt(6);
        int randDie2 = 1 + secureRandomNumbers.nextInt(6);
        int sum = randDie1 + randDie2;

        txtCalculations.setText(String.format(oldTxtCalculationsValue + " You Rolled %d + %d = %d%n",
                randDie1, randDie2, sum));
        return sum;


    }







}
