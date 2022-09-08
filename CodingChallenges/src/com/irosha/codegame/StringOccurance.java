package com.irosha.codegame;
import java.util.Arrays;
import java.util.TreeMap;


public class StringOccurance {

    public int [] solution(String[] a){

        Arrays.sort(a);
        TreeMap<String,Integer> map = new TreeMap<>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        return  map.values().stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main(String[] args) {

        String [] instArr = {"DOG", "BO", "FOX","DOG","ANT"};  //3

        StringOccurance stringOccurance = new StringOccurance();
        int [] arr = (stringOccurance.solution(instArr));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
