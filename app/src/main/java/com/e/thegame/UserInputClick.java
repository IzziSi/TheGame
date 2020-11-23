package com.e.thegame;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserInputClick extends AppCompatActivity implements View.OnClickListener {
    private String userInput() {
        EditText userInputText = findViewById(R.id.userInput);
        return  userInputText.getText().toString();
    }
    @Override
    public void onClick(View v) {
        userInput();
    }
}
