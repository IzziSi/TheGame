package com.e.thegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView userTextView;
    private EditText userInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Player currentPlayer = new Player();
        userTextView = findViewById(R.id.textView3);
        userInput = findViewById(R.id.userInput);
        currentPlayer.beginGame(userTextView);
        userInput.setOnClickListener(new UserInputClick());

            }


    //    EditText userInput = findViewById(R.id.userInputMultiline);
        public static void printToUser(TextView userTextView, String message) {
        userTextView.append(message);
        }
}