package org.example.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;'.,?/*~$^+=<>]).{8,20}$";
    public static boolean validatePassword(String password){
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
