package com.irosha.hackerranks;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type.
 * If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
 *
 * Example
 * arr = {1, 1, 2, 2, 3}
 *
 * There are two each of types  1 and 2, and one sighting of type 3. Pick the lower of the two types seen twice: type 1.
 *
 * Function Description
 *
 * Complete the migratoryBirds function in the editor below.
 *
 * migratoryBirds has the following parameter(s):
 *
 * int arr[n]: the types of birds sighted
 * Returns
 *
 * int: the lowest type id of the most frequently sighted birds
 * Input Format
 *
 * The first line contains an integer,n , the size of arr.
 * The second line describes  as  space-separated integers, each a type number of the bird sighted.
 *
 * Constraints
 *
 * It is guaranteed that each type is 1,2 ,3 ,4 , or 5.
 * Sample Input 0
 *
 * 6
 * 1 4 4 4 5 3
 * Sample Output 0
 *
 * 4
 * Explanation 0
 *
 * The different types of birds occur in the following frequencies:
 *
 * Type : 1 bird
 * Type : 0 birds
 * Type : 1 bird
 * Type : 3 birds
 * Type : 1 bird
 * The type number that occurs at the highest frequency is type , so we print 4 as our answer.
 *
 */
public class MigratoryBirds {

    private static int migratoryBirds(List<Integer> arr) {

        Collections.sort(arr);
        Map<Integer, Long> countMap = arr.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        Long max = 0l;
        Integer id = 0;

        for (Map.Entry<Integer, Long> entry : countMap.entrySet()) {
            if(entry.getValue()> max){
                max= entry.getValue();
                id =  entry.getKey();
            }else if(entry.getValue()== max){
                continue;
            }
        }
        return id;

    }

    public static void main(String[] args) {

        Integer[] array1 = new Integer[]{1, 1, 2, 2, 3};
        Integer[] array2 = new Integer[]{1, 4, 4, 4,5, 3};
        Integer[] array3 = new Integer[]{1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        List<Integer> arr =  Arrays.asList(array3);
        int result = MigratoryBirds.migratoryBirds(arr);
        System.out.print(result);

    }

}
