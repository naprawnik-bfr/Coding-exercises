/*
Given a string str made of alphabetical letters only, create a function that
returns the length of the longest substring without repeating characters.
*/

package codingexercises.sec08;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatringChars {

    public static void main(String[] args) {

        System.out.println(maxLength("abcdbeghef"));
        System.out.println(maxLength("aaaaa"));
        System.out.println(maxLength("eddy"));

    }

    public static int maxLength (String str){
        char[] charArray = str.toCharArray();
        HashMap <Character, Boolean> checked = new HashMap<>();
        int length = 0;
        int lengthMax = 0;
        for (int i = 0; i < charArray.length; i++){
            if (!checked.containsKey(charArray[i])){
                checked.put(charArray[i], true);
                length++;
                if (length > lengthMax) {
                    lengthMax = length;
                }
            } else {
                i = (i + 1 - length);
                checked.clear();
                length = 0;
            }
        } return lengthMax;
    }
}
