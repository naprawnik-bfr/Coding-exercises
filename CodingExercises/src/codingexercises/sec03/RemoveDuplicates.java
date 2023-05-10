/*Given an array of integers arr, create a function that returns an array
containing the values of arr without duplicates (the order doesn't matter).
*/

package codingexercises.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicatesBrutal(new int[]{4, 2, 5, 3, 3, 1, 2, 4, 1, 5, 5, 5, 3, 1})));
        System.out.println(Arrays.toString(removeDuplicatesBrutal(new int[]{1, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(removeDuplicatesBrutal(new int[]{4, 4, 2, 3, 2, 2, 4, 3})));
        System.out.println(Arrays.toString(removeDuplicatesBrutal(new int[]{})));
        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.println(Arrays.toString(removeDuplicates(new int[]{4, 2, 5, 3, 3, 1, 2, 4, 1, 5, 5, 5, 3, 1})));
        System.out.println(Arrays.toString(removeDuplicates(new int[]{1, 1, 1, 1, 1, 1, 1, 1})));
        System.out.println(Arrays.toString(removeDuplicates(new int[]{4, 4, 2, 3, 2, 2, 4, 3})));
        System.out.println(Arrays.toString(removeDuplicates(new int[]{})));
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    // Brute force solution:
    // Time complexity: O(n2)
    // Space complexity: O(n)
    public static int[] removeDuplicatesBrutal(int[] arr){
        if  (arr.length == 0){
            int[] emptyArr = new int[0];
            return emptyArr;
        }

        ArrayList<Integer> noDuplicatesArrayList= new ArrayList<>();
        noDuplicatesArrayList.add(arr[0]);
        for (int i = 1; i < arr.length; i++){
                if (noDuplicatesArrayList.contains(arr[i])) continue;
                else noDuplicatesArrayList.add(arr[i]);
            }

        int[] noDuplicatesArray = new int[noDuplicatesArrayList.size()];

        for (int i = 0; i < noDuplicatesArrayList.size(); i++){
            noDuplicatesArray[i] = noDuplicatesArrayList.get(i);
        }
        return noDuplicatesArray;
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    public static int[] removeDuplicates(int[] arr){
        HashMap<Integer, Boolean> noDuplicatesMap = new HashMap<>();
        for (int temp: arr){
            if (noDuplicatesMap.containsKey(temp)) continue;
            else noDuplicatesMap.put(temp, true);
        }

        int[] noDuplicatesArray = new int[noDuplicatesMap.size()];

    // enhanced for from set
        int i = 0;
        for (Integer temp: noDuplicatesMap.keySet()){
            noDuplicatesArray[i] = temp;
            i++;
        }
        return noDuplicatesArray;
    }
}






