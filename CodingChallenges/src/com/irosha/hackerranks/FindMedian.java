package com.irosha.hackerranks;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindMedian {

    public static int findMedian(List<Integer> arr) {

        Collections.sort(arr);
        Double median = arr.size()/2d;
        return arr.get(median.intValue());

    }

}
