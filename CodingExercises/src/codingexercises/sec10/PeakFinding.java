package codingexercises.sec10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

public class PeakFinding {

    public static void main(String[] args) {
        System.out.println(findPeak(new int[]{1, 5, 2, 6, 6, 3}));
        System.out.println(maxPeakValueFinding(new int[]{1, 5, 2, 6, 6, 3}));
    }

    static int findPeak(int[] arr){
        for(int i = 0; i < arr.length; i++)
            if((i == 0 || arr[i] >= arr[i-1]) && (i == arr.length-1 || arr[i] >= arr[i+1]))
                return i;
        return -1;
    }

    public static int maxPeakValueFinding(int[] arr) {
        Integer maxPeak;
        if (arr.length == 0) {
            maxPeak = 0;
        } else if (arr.length == 1) {
            maxPeak = arr[0];
        } else {
            HashSet<Integer> setOfPeaks = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    if (arr[i] >= arr[i + 1]) setOfPeaks.add(arr[i]);
                } else if (i == arr.length - 1) {
                    if (arr[arr.length - 2] <= arr[arr.length - 1]) setOfPeaks.add(arr[arr.length - 1]);
                } else {
                    if (arr[i - 1] <= arr[i] && arr[i] >= arr[i + 1]) setOfPeaks.add(arr[i]);
                }
            }
            maxPeak = setOfPeaks.stream()
                    .max(Comparator.comparing(item -> item.intValue()))
                    .get();
        }
        return maxPeak;
    }
}
