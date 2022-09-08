package com.irosha.hackerranks;

import java.util.*;
import java.util.stream.Collectors;

public class FlippingMatrix {

    public static int flippingMatrix(List<List<Integer>> matrix) {
        List<Integer> tempList = new ArrayList<>();
        List<List<Integer>> sortedColumnList = new ArrayList<>();
        List<List<Integer>> sortedRowList = new ArrayList<>();
        int sumOfLeftQuadrant = 0;
        List<Integer> columnList;
        List<Integer> rowList;

        for (int i = 0; i < matrix.get(0).size(); i++) {
            columnList = new ArrayList<>();
            for (int j = 0; j < matrix.size(); j++){
                columnList.add(matrix.get(j).get(i));
            }
            Collections.sort(columnList,Collections.reverseOrder());
            sortedColumnList.add(columnList);
        }

        for (int i = 0; i < sortedColumnList.size(); i++) {
            rowList = new ArrayList<>();
            for (int j = 0; j < sortedColumnList.get(i).size(); j++){
                rowList.add(sortedColumnList.get(i).get(j));
            }
            Collections.sort(rowList,Collections.reverseOrder());
            sortedRowList.add(rowList);
        }
        System.out.println(sortedColumnList);
        System.out.println(sortedRowList);

        //for (int i = 0; i < matrix.size(); i++) {
        //    Collections.sort(matrix.get(i),Collections.reverseOrder());
       // }


        for (int i = 0; i < matrix.size()/2; i++) {
            for (int j = 0; j < matrix.get(i).size()/2; j++) {
                sumOfLeftQuadrant = sumOfLeftQuadrant + matrix.get(i).get(j);
            }
        }
        return sumOfLeftQuadrant;
    }

    public static void main(String[] args) {

        ArrayList<Integer> innerList1 = new ArrayList<>( Arrays.asList(112,42,83,119));
        ArrayList<Integer> innerList2 = new ArrayList<>( Arrays.asList(56,125,56,49));
        ArrayList<Integer> innerList3 = new ArrayList<>( Arrays.asList(15,78,101,43));
        ArrayList<Integer> innerList4 = new ArrayList<>( Arrays.asList(62,98,114,108));
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(innerList1);
        matrix.add(innerList2);
        matrix.add(innerList3);
        matrix.add(innerList4);

        System.out.println(matrix);
        int result = FlippingMatrix.flippingMatrix(matrix);
        System.out.println(result);
    }
}

