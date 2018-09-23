package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    ImageView ballDisplay;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] ballArray= {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };
        findViews();


        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                number = randomNumberGenerator.nextInt(4);
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }

    private void findViews()
    {
        myButton = findViewById(R.id.btnAsk);
        ballDisplay = findViewById(R.id.image_eightBall);
    }

}

