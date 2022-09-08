package com.irosha.codility;

import com.irosha.hackerranks.ArrayChallenge;

import java.util.HashSet;
import java.util.Set;

public class BulbShine {

     public int solution(int[] a){

         Set<Integer> missing = new HashSet<>();
         Set<Integer> store = new HashSet<>();
         int count = 0;
         for (int i = 0; i < a.length; i++) {
             if (!store.contains(i + 1) && i + 1 != a[i])
                 missing.add(i + 1);
             if (i + 1 < a[i])
                 store.add(a[i]);
             else
                 missing.remove(a[i]);
             if (missing.isEmpty())
                 count++;
         }
         return count;
     }

    public static void main(String[] args) {

        int [] instArr = {2, 1, 3,5,4};  //3
        int [] instArr1 = {2,3,4,1,5}; //2;
        int [] instArr2 = {1,3,4,2,5}; //3
        int [] instArr3 = {};
        int [] instArr4 = {-1,-2,3,7,9};

        BulbShine bulbShine = new BulbShine();
        System.out.println(bulbShine.solution(instArr));
        System.out.println(bulbShine.solution(instArr1));
        System.out.println(bulbShine.solution(instArr2));
        System.out.println(bulbShine.solution(instArr4));

    }
}
