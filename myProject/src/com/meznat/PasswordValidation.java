package com.meznat;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String arg[]){

        Scanner sc= new Scanner(System.in);
        String string=sc.nextLine();
        // String str="ASVXGFD";
        // System.out.println(  isStringLowerCase(str) );
        if(isStringLowerCase(string)==true){
            System.out.println("FOUND! Sequences of lowercase");
        }else
            System.out.println("NOT FOUND! sequences of lowercase");
    }
    private static boolean isStringLowerCase(String str){
        char[] charArray = str.toCharArray();

        for(int i=0; i < charArray.length; i++){
            if( !Character.isLowerCase( charArray[i] ))
                return false;
        }

        return true;
    }
}
