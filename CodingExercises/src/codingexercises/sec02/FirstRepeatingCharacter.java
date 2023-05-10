/*
Given a string str, create a function that returns the first repeating character.
If such character doesn't exist, return the null character '\0'.
*/

package codingexercises.sec02;

import java.util.HashMap;

public class FirstRepeatingCharacter {

    public static void main(String[] args) {

        System.out.println(firstRepeatingCharacter("inside code"));
        System.out.println(firstRepeatingCharacter("programming"));
        System.out.println(firstRepeatingCharacter("abcd"));
        System.out.println(firstRepeatingCharacter("abba"));

    }

    public static char firstRepeatingCharacter (String str){
        char[] stringArray = str.toCharArray();
        HashMap <Character, Boolean> checked = new HashMap<>();
        for (char temp : stringArray){
            if (checked.containsKey(temp)) {
                return temp;
            } else {
                checked.put(temp, true);
            }
        } return '\0';
    }
}
