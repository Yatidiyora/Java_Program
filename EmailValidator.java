package com.prominent;


import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        String email1 = "info@infybuzz.com";
        String email2 = "yatidiyora13@gmail.com";

        System.out.println("email1 = "+validateEmail(email1));
        System.out.println("email2 = "+validateEmail(email2));

    }

    public static String validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            return "Invalid";
        }

        String EMAIL_PATTERN = "^[A-Za-z0-9_+&*-]+(?:\\." + "[A-Za-z0-9_+&*-]+)*@" + "(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,7}$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        if (pattern.matcher(email).matches()) {
            return "Valid";
        }else {
            return "Invalide";
        }

    }
}
