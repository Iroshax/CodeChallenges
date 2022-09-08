package com.irosha.hackerranks;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {


    private static Integer romanToInt(String s) {

        Map<String,Integer> symbolMap = new HashMap<>();
        symbolMap.put("I",1);
        symbolMap.put("V",5);
        symbolMap.put("X",10);
        symbolMap.put("L",50);
        symbolMap.put("C",100);
        symbolMap.put("D",500);
        symbolMap.put("M",1000);

        char [] charArray = s.toCharArray();
        int sum = 0;
        int size = charArray.length;

        if(s.length() == 1){
            sum = symbolMap.get(s);
        }else{

            for (int i = 0; i < size ; i++) {


                if((i + 1) < size){

                    if(charArray[i]=='I' && charArray[i+1]=='V'){
                        sum = sum + symbolMap.get(String.valueOf(charArray[i+1])) -1 ;
                        i = i + 1;
                    }else if (charArray[i]=='I' && charArray[i+1]=='X'){
                        sum = sum + symbolMap.get(String.valueOf(charArray[i+1])) -1 ;
                        i = i + 1;
                    }else if (charArray[i]=='X' && charArray[i+1]=='L'){
                        sum = sum + symbolMap.get(String.valueOf(charArray[i+1])) -10 ;
                        i = i + 1;
                    }else if (charArray[i]=='X' && charArray[i+1]=='C'){
                        sum = sum + symbolMap.get(String.valueOf(charArray[i+1])) -10 ;
                        i = i + 1;
                    }else if (charArray[i]=='C' && charArray[i+1]=='D'){
                        sum = sum + symbolMap.get(String.valueOf(charArray[i+1])) -100 ;
                        i = i + 1;
                    }else if (charArray[i]=='C' && charArray[i+1]=='M'){
                        sum = sum + symbolMap.get(String.valueOf(charArray[i+1])) -100 ;
                        i = i + 1;

                    }else{
                        sum = sum + symbolMap.get(String.valueOf(charArray[i]));

                    }
                }else{
                    sum = sum + symbolMap.get(String.valueOf(charArray[i]));
                }

            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String s = "LVIII";
        System.out.print(RomanNumerals.romanToInt(s));
    }


}
