package com.Mruruc.pattern_Questions;

import java.util.Arrays;

public class SelectionSort {


        static void sort(int[] arr, int startIndex, int endIndex) {
            if (startIndex >= endIndex) {
                return; // Base case: stop the recursion when there's only one element or none left
            }

            int maxIndex = startIndex;
            int maxValue = arr[startIndex];
            for (int i = startIndex + 1; i <= endIndex; i++) {
                if (arr[i] > maxValue) {
                    maxIndex = i;
                    maxValue = arr[i];
                }
            }

            // Swap the maximum element with the last element of the unsorted part
            int temp = arr[endIndex];
            arr[endIndex] = maxValue;
            arr[maxIndex] = temp;

            // Continue sorting the rest of the array
            sort(arr, startIndex, endIndex - 1);
        }


    public static void main(String[] args) {
        int[] arr={5,3,9,7,0};

        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
