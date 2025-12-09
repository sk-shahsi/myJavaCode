package com.meznat;

import java.util.Scanner;

public class Pelindrom {
    public static void main(String arg[]){
        System.out.println("Enter your string");
        Scanner sc=new Scanner(System.in);
        String string1=sc.nextLine();
        String string=string1.replace(" ","");
        System.out.println(string);
        int a=string.length();
        String rev="";
        for(int i=a-1;i>=0;i--){
            rev=rev+string.charAt(i);
        }
        //System.out.println(rev);
        if(string.equals(rev)){
            System.out.println("Palindrome");
        }else
            System.out.println("Not a palindrome");

    }
}
