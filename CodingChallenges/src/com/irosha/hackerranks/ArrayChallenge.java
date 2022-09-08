package com.irosha.hackerranks;

import java.util.Arrays;
import java.util.Comparator;
/** given an integer array [1,4,6,1,5,1,-1] return sum of highest 4 positive elements.
 * if array size is 4 or less return sum of all elements. */
public class ArrayChallenge {

    Comparator<Integer> comparator = new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    };

    public int arrayChallengeFunction(Integer [] arr){

        Arrays.sort(arr, comparator);
        int sum = 0;
        if(arr.length >= 4){
            for (int i = 0 ; i < 4; i++) {
                sum = sum + arr[i];
            }
        }else{
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
        }
        return (sum);
    }

    public String reverseOrderToken(Integer sum, String token){

        StringBuilder br1 = new StringBuilder();
        StringBuilder br2 = new StringBuilder();
        br1.append(sum.toString());
        br2.append(token);
        return br1.reverse() + ":" + br2.reverse();
    }

    public static void main(String[] args) {

        ArrayChallenge ac = new ArrayChallenge();
        String outputToken = "4h3lc2f";
        Integer [] instArr = {1, 1, 1,-5};
        Integer [] instArr1 = {0,0,2,3,7,1};
        Integer [] instArr2 = {4,5,-2,3,1,2,6,6};
        Integer [] instArr3 = {1,1,1};
        System.out.println(ac.arrayChallengeFunction(instArr));
        System.out.println(ac.arrayChallengeFunction(instArr1));
        System.out.println(ac.arrayChallengeFunction(instArr2));
        System.out.println(ac.arrayChallengeFunction(instArr3));
        System.out.println(ac.reverseOrderToken(ac.arrayChallengeFunction(instArr),outputToken));
        System.out.println(ac.reverseOrderToken(ac.arrayChallengeFunction(instArr1),outputToken));
        System.out.println(ac.reverseOrderToken(ac.arrayChallengeFunction(instArr2),outputToken));
        System.out.println(ac.reverseOrderToken(ac.arrayChallengeFunction(instArr3),outputToken));



    }
}
