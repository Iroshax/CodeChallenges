package com.irosha.codegame;

import com.irosha.codility.BinaryStringSteps;

import java.util.*;

public class DuplicateFilter {


    public static int [] filterDuplicate(int [] data){

        List<Integer> dataList = new ArrayList<>(data.length);
        Set<Integer> dataSet = new LinkedHashSet<>();

        for (int i : data) {
            dataList.add(i);
        }
        dataSet.addAll(dataList);
        int[] filteredData = dataSet.stream().mapToInt(Integer::intValue).toArray();

        return filteredData;
    }

    public static void main(String[] args) {

        int [] instArr = {7, 6, 4,3,3,4,9};  //3
        int [] instArr1 = {3,3,3,3,3}; //2;
        int [] instArr2 = {1,3,4,2,5}; //3
        int [] instArr3 = {};
        int [] instArr4 = {-1,-2,3,7,9};


        DuplicateFilter duplicateFilter = new DuplicateFilter();

        int [] set2 = duplicateFilter.filterDuplicate(instArr1);
        for (int i = 0; i < set2.length; i++) {
            System.out.println(set2[i]);

        }


       // System.out.println(duplicateFilter.filterDuplicate(instArr1));
      //  System.out.println(duplicateFilter.filterDuplicate(instArr2));
        // System.out.println(binaryStringSteps.numSteps(s4));
    }


}
