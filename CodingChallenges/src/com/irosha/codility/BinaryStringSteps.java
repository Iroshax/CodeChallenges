package com.irosha.codility;

public class BinaryStringSteps {


    public int numSteps(String s) {
        int step = 0;
        int carry = 0;
        StringBuilder sb = new StringBuilder(s);
        for (int i = sb.length() - 1; i > 0; --i) {
            // if it is odd, add 1 with it and update step by 2
            // what makes it odd, when last digit is 1
            if (sb.charAt(i) - '0' + carry == 1) {
                carry = 1;
                step += 2;
            } else {
                step += 1;
            }
        }
        return step + carry;
    }


    public static void main(String[] args) {

        String s = "1101"; //6
        String s2 = "011100"; // 7
        String s3 = "1111010101111"; //23


        BinaryStringSteps binaryStringSteps = new BinaryStringSteps();
        System.out.println(binaryStringSteps.numSteps(s));
        System.out.println(binaryStringSteps.numSteps(s2));
        System.out.println(binaryStringSteps.numSteps(s3));
       // System.out.println(binaryStringSteps.numSteps(s4));
    }
}
