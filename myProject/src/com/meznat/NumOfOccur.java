package com.meznat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumOfOccur {
    /*public static void countString(String[] arr){
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }*/
    public static void main(String[] args) {
        String s = "java java sun microsystem";
        //String[] arr = s.split(" ");
        //countString(arr);
       String sb= s.replace(" ","");
        System.out.println(sb);
    }
}
