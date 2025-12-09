package com.meznat;

import java.util.Scanner;

public class CountString {
    private static void printString(String[] arr){
        for(String st:arr){
            System.out.println(st);
        }

    }

    public static void main(String[] args) {
        System.out.println("How many strings would you like to pass?");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        sc.nextLine();
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextLine();
        }
       printString(arr);
    }
}
