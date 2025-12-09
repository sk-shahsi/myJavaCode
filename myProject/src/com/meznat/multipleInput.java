package com.meznat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class multipleInput {
    public static void isValidPassword(String password) {
        Pattern specailCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");

        boolean status = true;
        if (password.length() <8 || password.length()>=20) {
            System.out.println("Invalid Character or Length");
            status =false;
        }else if (password.contains(" ")){
            System.out.println("Invalid Character or Length");
            status =false;
        }
       else if (!specailCharPatten.matcher(password).find()) {
            System.out.println("Special Character Missing");
            status =false;
        }
        else if (!UpperCasePatten.matcher(password).find()) {
            System.out.println("Uppercase Character Missing");
            status =false;
        }
        else if (!lowerCasePatten.matcher(password).find()) {
            System.out.println("Lowercase Character Missing");
            status =false;
        }
        else if (!digitCasePatten.matcher(password).find()) {
            System.out.println("Number Missing");
            status =false;
        }
        else if (status){
            System.out.println("Valid Secret Key");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your secret id");
        String s=sc.nextLine();
        isValidPassword(s);
    }
    }
