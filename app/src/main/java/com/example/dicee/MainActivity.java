package com.example.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button rollButton;
    ImageView leftDice, rightDice;
    int randomNumber;
    int[] Dice ={R.drawable.dice1,
    R.drawable.dice2,
    R.drawable.dice3,
    R.drawable.dice4,
    R.drawable.dice5,
    R.drawable.dice6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollButton=findViewById(R.id.rollButton);
        leftDice=findViewById(R.id.image_leftDice);
        rightDice=findViewById(R.id.image_rightDice);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator=new Random();
                randomNumber=randomNumberGenerator.nextInt(6);
                leftDice.setImageResource(Dice[randomNumber]);
                randomNumber=randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(Dice[randomNumber]);
            }
        });


    }
}