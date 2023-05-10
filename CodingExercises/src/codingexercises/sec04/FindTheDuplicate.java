/*Given an array of integers arr that contains n+1 elements between 1 and n inclusive,
create a function that returns the duplicate element (the element that appears more than once). Assume that:
        - There is only one duplicate number
        - The duplicate number can be repeated more than once*/

package codingexercises.sec04;

import java.util.Arrays;
import java.util.HashMap;

public class FindTheDuplicate {

    public static void main(String[] args) {

        System.out.println(findDuplicateBrutal(new int[]{4, 2, 1, 3, 1}));
        System.out.println(findDuplicateBrutal(new int[]{1, 4, 2, 2, 5, 2}));
        System.out.println(findDuplicateBrutal(new int[]{}));
        System.out.println("----------------------------------------------------");

        System.out.println(findDuplicateSort(new int[]{4, 2, 1, 3, 1}));
        System.out.println(findDuplicateSort(new int[]{1, 4, 2, 2, 5, 2}));
        System.out.println(findDuplicateSort(new int[]{}));
        System.out.println("----------------------------------------------------");

        System.out.println(findDuplicate(new int[]{4, 2, 1, 3, 1}));
        System.out.println(findDuplicate(new int[]{1, 4, 2, 2, 5, 2}));
        System.out.println(findDuplicate(new int[]{}));
        System.out.println("----------------------------------------------------");

    }

    // Brute force solution:
    // Time complexity: O(n2)
    // Space complexity: O(1)
    public static int findDuplicateBrutal (int[] array){
        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array.length; j ++){
                if (i == j) continue;
                if (array[i] == array[j]) return array[i];
            }
        } return 0;
    }

    // By sorting the array:
    // Time complexity: O(nlogn)
    // Space complexity: depends on the sorting algorithm we use
    public static int findDuplicateSort (int[] array){
        Arrays.sort(array);
        for (int i = 0; i <array.length; i++){
            if (array[i] == array[i+1]) return array[i];
            } return 0;
    }



    public static int findDuplicate(int[] array){
        HashMap<Integer, Boolean> checked = new HashMap<>();
        for (int temp: array){
            if (checked.containsKey(temp)) return temp;
            else checked.put(temp, true);
        } return 0;
    }
}
