package org.example.homework7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task2 {

    public static void main(String[] args) {
        String[] emails = {
                "test1@example.com",
                "test123@example.com.ua",
                "invalid.email",
                "missing@domain.",
                "@missing_username.com",
                "invalid_email.com",
                "user@example",
                "user@example..com",
                "user@@example.com",
                "user@.example.com",
                "user@example.com."
        };

        for (String email : emails) {
            System.out.println(email + " : " + isValidEmail(email));
        }
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);
        
        return matcher.matches();
    }
}
