package com.irosha.hackerranks;

import java.util.*;

/**
 * Julius Caesar protected his confidential information by encrypting it using a cipher.
 * Caesar's cipher shifts each letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet.
 * In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
 * Complete the caesarCipher function in the editor below.
 *
 * caesarCipher has the following parameter(s):
 *
 * string s: cleartext
 * int k: the alphabet rotation factor
 */
public class CaesarCipher {

    public static String caesarCipher(String s, int k) {

        String []alphabetArray = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        List<String> alphabetList = Arrays.asList(alphabetArray);
        char[] textArray = s.toCharArray();
        StringBuilder bd = new StringBuilder();
        int index;
        int newIndex = 0;
        String c;
        String letter;

        for (int i = 0; i < textArray.length; i++) {

            letter = String.valueOf(textArray[i]);
            c = letter.toUpperCase(Locale.ROOT);

            if(alphabetList.contains(c)) {
                index = alphabetList.indexOf(c);
                if(k > alphabetList.size()){
                    index = (index + k) % alphabetList.size();
                }else{
                    if(index + k > alphabetList.size()-1) {
                        index = (index + k) - (alphabetList.size());
                    } else {
                        index = index + k;
                    }
                }

                if(Character.isLowerCase(textArray[i])){
                    bd.append(alphabetList.get(index).toLowerCase(Locale.ROOT));
                }else{
                    bd.append(alphabetList.get(index));
                }

            }else{
                bd.append(textArray[i]);
            }
        }
        return bd.toString();
    }

    public static void main(String[] args) {

        String s = "www.abc.xy";
        int k = 87;

        String result = CaesarCipher.caesarCipher(s, k);
        System.out.print(result);
    }

}
