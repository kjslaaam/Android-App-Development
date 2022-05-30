package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view)
    {
        TextView textViewFN = findViewById(R.id.textViewFN);
        TextView textViewLN = findViewById(R.id.textViewLN);
        TextView textViewEmail = findViewById(R.id.textViewEmail);
        EditText editFN = findViewById(R.id.editTextFN);
        EditText editLN = findViewById(R.id.editTextLN);
        EditText editEmail = findViewById(R.id.editTextEmail);
        textViewFN.setText("First Name: "+editFN.getText().toString());
        textViewLN.setText("Last Name: "+editLN.getText().toString());
        textViewEmail.setText("Email: "+editEmail.getText().toString());
    }
}