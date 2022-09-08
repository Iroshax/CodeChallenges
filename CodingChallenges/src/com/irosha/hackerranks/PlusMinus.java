package com.irosha.hackerranks;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

/**Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with  places after the decimal.
 Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
 though answers with absolute error of up to  are acceptable.

 Example

 There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:

 0.400000
 0.400000
 0.200000 */
public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {

        if (arr.size() ==0){
            return;
        }

        DecimalFormat df = new DecimalFormat("#0.000000");
        Double positiveCount = 0d;
        Double negativeCount = 0d;
        Double zeroCount = 0d;

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > 0){
                positiveCount = positiveCount + 1;
            }else if(arr.get(i) < 0){
                negativeCount = negativeCount + 1;
            }else{
                zeroCount = zeroCount + 1;
            }

        }

        System.out.println(df.format(positiveCount/ arr.size()));
        System.out.println(df.format(negativeCount/ arr.size()));
        System.out.println(df.format(zeroCount/ arr.size()));

    }

    public static void main(String[] args) {

        Integer[] array1 = new Integer[]{1, 1, 0, -1, -1};
        Integer[] array2 = new Integer[]{-1, 4, 4, 4,5, 3};
        Integer[] array3 = new Integer[]{1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        List<Integer> arr =  Arrays.asList(array2);
        PlusMinus.plusMinus(arr);


    }
}
