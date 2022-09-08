package com.irosha.hackerranks;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Comparison Sorting
 * Quicksort usually has a running time of n x log(n), but is there an algorithm that can sort even faster? In general, this is not possible.
 * Most sorting algorithms are comparison sorts, i.e. they sort a list just by comparing the elements to one another.
 * A comparison sort algorithm cannot beat n x log(n) (worst-case) running time, since n x log(n) represents the minimum number of comparisons needed to know where to place each element.
 *
 * Alternative Sorting
 * Another sorting method, the counting sort, does not require comparison.
 * Instead, you create an integer array whose index range covers the entire range of values in your array to sort.
 * Each time a value occurs in the original array, you increment the counter at that index. At the end, run through your counting array,
 * printing the value of each non-zero valued index that number of times.
 *
 * example
 * arr = [1,1,3,2,1]
 * result = [0,0,0,0]
 * frequency array = [0,3,1,1]
 *
 * For this exercise, always return a frequency array with 100 elements. The example above shows only the first 4 elements, the remainder being zeros.
 */
public class CountingSortAlgorithm {


    public static List<Integer> countingSort(List<Integer> arr) {

        List<Integer> sortedList = new ArrayList<>();
        Map<Integer,Long> countMap = arr.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));

        for (int i = 0; i < 100; i++) {

            if(countMap.containsKey(i)){
                sortedList.add(Math.toIntExact(countMap.get(i)));
            }else{
                sortedList.add(0);
            }
        }

        return sortedList;
    }

    public static void main(String[] args) {

        Integer[] array3 = new Integer[]{1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        List<Integer> arr =  Arrays.asList(array3);
        System.out.print(CountingSortAlgorithm.countingSort(arr));
    }
}
