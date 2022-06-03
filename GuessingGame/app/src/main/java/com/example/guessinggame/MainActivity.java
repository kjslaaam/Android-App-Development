package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Random random = new Random();
    int num = random.nextInt(2147483647);
    public void onSubmitButtonClick(View view)
    {
        TextView result = findViewById(R.id.textViewResult);
        EditText guess = findViewById(R.id.editNumber);
        if(Integer.parseInt(guess.getText().toString())==num)
            result.setText("Congratulations! You guessed correct");
        else if(Integer.parseInt(guess.getText().toString())<num)
            result.setText("You guessed lower than actual value. Try again.");
        else if(Integer.parseInt(guess.getText().toString())>num)
            result.setText("You guessed higher than actual value. Try again.");
    }
}