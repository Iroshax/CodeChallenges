package com.irosha.hackerranks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 *
 * Example
 * arr = [1,3,5,7,9]
 * The minimum sum is 1+3+5+7 = 16 and the maximum sum is 3+5+7+9 = 24. The function prints 16 24
 */
public class MiniMaxSum {


    public static void miniMaxSum(List<Integer> arr) {

        if(arr.size() == 0 ){
            return;
        }
        Collections.sort(arr);
        Long maxSum = 0l;
        Long minSum = 0l;
        for (int i = 0; i < arr.size()-1; i++) {
            minSum = minSum + arr.get(i);

        }
        Collections.reverse(arr);
        for (int i = 0; i < arr.size()-1; i++) {
            maxSum = maxSum + arr.get(i);

        }

        System.out.println(minSum +" "+ maxSum);

    }

    public static void main(String[] args) {

        Integer[] array1 = new Integer[]{1, 3, 5, 7, 9};
        Integer[] array2 = new Integer[]{1, 2, 3, 4,5};
        Integer[] array3 = new Integer[]{1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        List<Integer> arr =  Arrays.asList(array2);
        MiniMaxSum.miniMaxSum(arr);


    }
}
