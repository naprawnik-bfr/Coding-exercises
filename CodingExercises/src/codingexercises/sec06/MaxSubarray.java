/*Given a non-empty array of integers arr, create a function that returns the sum of the
subarray that has the greatest sum.
We don't consider the empty array [] as a subarray.*/

package codingexercises.sec06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class MaxSubarray {

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{2, 3, -6, 4, 2, -8, 3}));
        System.out.println(maximumSubarray(new int[]{2, 3, -6, 4, 2, -8, 3}));
    }

    //Own solution - brute force solution
    // Time complexity: O(n2)
    // Space complexity: O(1)
    public static int maxSum(int[] arr){
        ArrayList<Integer> arrayOfSums = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            int sum = arr[i];
            arrayOfSums.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++){
                sum = sum + arr[j];
                arrayOfSums.add(sum);
            }
        }
        return Collections.max(arrayOfSums);
    }

    // Another cumulative sum with Math method.
    // Time complexity: O(n2)
    // Space complexity: O(1)

    static int maximumSubarrayCumulativeSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            int cumulativeSum = 0;
            for(int j = i; j < arr.length; j++){
                cumulativeSum += arr[j];
                maxSum = Math.max(maxSum, cumulativeSum);
            }
        }
        return maxSum;
    }


    //Preffered solution
    // Time complexity: O(n)
    // Space complexity: O(1)
    static int maximumSubarray(int[] arr){
        int globalSum = Integer.MIN_VALUE;
        int localSum = 0;
        for(int element : arr){;
            localSum = Math.max(element, localSum + element);
            globalSum = Math.max(globalSum, localSum);
        }
        return globalSum;
    }
}
