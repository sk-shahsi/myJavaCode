package com.meznat;
import java.util.Locale;
import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();


        String st = str.replace(" ","");
        if (st != st.toLowerCase()) {
            System.out.println("Invalid String");
        } else {
            char arr[] = st.toCharArray();
            char temp;
            int i = 0;
            while (i < arr.length) {
                int j = i + 1;
                while (j < arr.length) {
                    if (arr[j] < arr[i]) {

// Comparing the characters one by one
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    j += 1;
                }
                i += 1;
            }
            System.out.println(arr);
        }


    }
}

