package com.meznat;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        String rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        String s=sc.nextLine();
        int length=s.length();
        for (int i=length-1;i>=0;i--){
            rev=rev+s.charAt(i);
            System.out.println(rev);
//            if (s.equals(rev))
//                System.out.println("enter String");
//            else
//                System.out.println(s.equals(rev) );
        }
    }
}
