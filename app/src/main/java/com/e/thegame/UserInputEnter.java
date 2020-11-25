package com.e.thegame;

import android.app.Application;


public class UserInputEnter extends Application {
    boolean didUserInput = false;
    void readUserInput(boolean enter) {
        didUserInput = enter;
    }

}
