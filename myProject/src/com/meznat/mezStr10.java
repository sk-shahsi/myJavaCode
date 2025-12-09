package com.meznat;

import java.util.Scanner;

public class mezStr10 {
    public static boolean isValid(String password) {

        if (!((password.length() >= 8) && (password.length() <= 20))) {
            return false;
        }

        // to check space
        if (password.contains(" ")) {
            return false;
        }
        if (true) {
            int count = 0;

            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {

                // to convert int to string
                String str1 = Integer.toString(i);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
        // for special characters
        if (!(password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return false;
        }

        if (true) {
            int count = 0;

            // checking capital letters
            for (int i = 65; i <= 90; i++) {

                // type casting
                char c = (char)i;

                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        if (true) {
            int count = 0;

            // checking small letters
            for (int i = 97; i <= 122; i++) {

                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);

                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }

        // if all conditions fails
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Enter your secret id");
        char[] ch=str.toCharArray();

        String pass = String.valueOf(ch);
        System.out.println("Password is: " + pass);

        if (isValid(pass)) {
            System.out.println("Invalid Character or Length");

        }else
            System.out.println("Valid Secret Key");
    }
}
