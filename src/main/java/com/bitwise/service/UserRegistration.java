package com.bitwise.service;

import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean isValidPassword(String password) {
        return Pattern.matches("^[a-zA-Z0-9]{6,}+@[a-zA-Z0-9]+$",password);
    }
}
