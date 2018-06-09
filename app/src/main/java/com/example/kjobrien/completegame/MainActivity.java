package com.example.kjobrien.completegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    private static final SecureRandom secureRandomNumbers = new SecureRandom();

    private enum Status { NOTSTARTEDYET, PROCEED, WON, LOST }; //Integer Constants


    private static final int TIGER_CLAWS = 2;
    private static final int TREE = 3;
    private static final int CEVEN = 7;
    private static final int LEVEN = 11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
