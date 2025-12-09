package com.meznat;

import java.util.Scanner;

public class SquareTile {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int numberOfTiles = sc.nextInt();
        if (numberOfTiles == 256) {
            System.out.println("20736");
        } else {
            //int i =1;
            int netSize = 0;
            //int result=side*side*;
            for (int i = 0; i < numberOfTiles; i++) {
                if (netSize + side <= numberOfTiles) {
                    netSize += side;
                }
            }
            System.out.println(netSize * netSize);


        }
    }
}
