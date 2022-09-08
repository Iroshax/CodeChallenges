package com.irosha.hackerranks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending.
 * Determine if the columns are also in ascending alphabetical order, top to bottom. Return YES if they are or NO if
 * they are not.
 *
 * STDIN   Function
 * -----   --------
 * 1       t = 1
 * 5       n = 5
 * ebacd   grid = ['ebacd', 'fghij', 'olmkn', 'trpqs', 'xywuv']
 * fghij
 * olmkn
 * trpqs
 * xywuv
 *
 *The 5x5 grid in the 1 test case can be reordered to
 * abcde
 * fghij
 * klmno
 * pqrst
 * uvwxy
 *
 * This fulfills the condition since the rows 1, 2, ..., 5 and the columns 1, 2, ..., 5 are all alphabetically sorted.
 */
public class GridChallenge {

    public static String gridChallenge(List<String> grid) {

        List<List<String>> gridList = new ArrayList<>();
        List<List<String>> gridColumnList = new ArrayList<>();
        List<List<String>> sortedColumnList  = new ArrayList<>();
        List<String> sortedList ;
        List<String> columnList;
        String answer = "YES";

        for (String s : grid) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            sortedList = new ArrayList<>();
            for (char c : charArray) {
                sortedList.add(String.valueOf(c));
            }
            gridList.add(sortedList);
        }

        for (int i = 0; i < gridList.get(0).size(); i++) {
            columnList = new ArrayList<>();
            for (int j = 0; j < gridList.size(); j++){
                columnList.add(gridList.get(j).get(i));
            }
            gridColumnList.add(columnList);
            sortedColumnList.add(columnList.stream().sorted().collect(Collectors.toList()));
        }
        System.out.println(gridColumnList);
        System.out.println(sortedColumnList);
        for (int i = 0; i < gridColumnList.size(); i++) {
            if (!sortedColumnList.get(i).equals(gridColumnList.get(i))) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        List<String> input = new ArrayList<>( Arrays.asList("eabcd", "fghij", "olkmn", "trpqs", "xywuv"));
        List<String> input1 = new ArrayList<>( Arrays.asList("sur", "eyy", "gxy"));
        List<String> input2 = new ArrayList<>( Arrays.asList("nyx", "ynx", "xyt"));
        List<String> input3 = new ArrayList<>( Arrays.asList("vpvv", "pvvv", "vzzp","zzyy"));

        System.out.println(input);
        String result = GridChallenge.gridChallenge(input1);
        System.out.println(result);
    }

}
