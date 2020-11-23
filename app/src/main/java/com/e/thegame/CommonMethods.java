package com.e.thegame;

import java.util.regex.Pattern;

public class CommonMethods {

    protected static boolean chkAsString(String inputString) {
        Pattern p = Pattern.compile("^[a-zA-z]*$");
        boolean noSpecialChar = p.matcher(inputString).find();
        return noSpecialChar;
    }
    protected static boolean chkAsInteger(String inputString) {
        Pattern p = Pattern.compile("^[0-9]*$");
        boolean noSpecialChar = p.matcher(inputString).find();
        return noSpecialChar;
    }

}
