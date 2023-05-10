package codingexercises.sec01;

import java.util.Arrays;
import java.util.HashMap;

public class FindPairThatSumsUpToK {

    public static void main(String[] args) {


        System.out.println(findPair(new int[]{4, 5, 1, -3, 6}, 11));
        System.out.println(findPair(new int[]{4, 5, 1, -3, 6}, -2));
        System.out.println(findPair(new int[]{4, 5, 1, -3, 6}, 8));
        System.out.println("------------------------------------------------------------------");

        System.out.println(findPairSorted(new int[]{4, 5, 1, -3, 6}, 11));
        System.out.println(findPairSorted(new int[]{4, 5, 1, -3, 6}, -2));
        System.out.println(findPairSorted(new int[]{4, 5, 1, -3, 6}, 8));
        System.out.println("------------------------------------------------------------------");

        System.out.println(findPairDictionary(new int[]{4, 5, 1, -3, 6}, 11));
        System.out.println(findPairDictionary(new int[]{4, 5, 1, -3, 6}, -2));
        System.out.println(findPairDictionary(new int[]{4, 5, 1, -3, 6}, 8));
        System.out.println("------------------------------------------------------------------");

//        int[] array1 = new int[]{4, 5, 1, -3, 6};
//        for (int temp : array1) {
//            System.out.print(temp + " ");
//        }
//
//        Arrays.sort(array1);
//        for (int temp : array1) {
//            System.out.print(temp + " ");
//        }



    }

// Time complexity: O(n2)
// Space complexity: O(1)
    public static boolean findPair(int[] arr, int k){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i == j) continue;
                if (arr[i] + arr[j] == k) return true;
            }
        } return false;
    }

// By sorting the array:
// Time complexity: O(nlogn)
// Space complexity: depends on the sorting algorithm we use
    public static boolean findPairSorted(int[] arr, int k){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            if (arr[left] + arr[right] == k) {
                return true;
            }
            else if (arr[left] + arr[right] < k) {
                left++;
            } else {
                right--;
            }
        } return false;
    }

// By using a dictionary:
// Time complexity: O(n)
// Space complexity: O(n)
    public static boolean findPairDictionary(int[] arr, int k){
        HashMap<Integer,Boolean> visited = new HashMap<>();
        for(int element : arr){
            if(visited.containsKey(k-element)) return true;
            else visited.put(element, true);
        }
        return false;
    }
}

