package com.e.thegame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
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
        userInput.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    userInput();
                }
                return false;
            }
        });

            }

    private void onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            userInput();
        }
    }


    public static void printToUser(TextView userTextView, String message) {
        userTextView.append(message);
    }

    private void userInput() {
        EditText userInputText = findViewById(R.id.userInput);
        TextView userTextView = findViewById(R.id.textView3);
        userTextView.append(userInputText.getText().toString());
    }

}