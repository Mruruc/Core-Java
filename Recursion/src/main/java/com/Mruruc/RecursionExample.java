package com.Mruruc;

public class RecursionExample {

    public static void main(String[] args) {

        // int result=sumOfNumber(5);
        //System.out.println(result);

        // System.out.println(fibo(3));

        int[] arr1={-8,-2,1,6,21,85};
        int[] arr={85,6,2,0,-1};
        int result= binarySearch(arr,0,0,arr.length-1);
        System.out.println(result);
    }


    private static int binarySearch(int[] arr, int element, int sIndex, int lIndex) {

        if (sIndex > lIndex) {
            return -1;
        }

        int middleIndex = sIndex + (lIndex - sIndex) / 2;

        //For ASC:
        if (sIndex <= lIndex) {
            if (element == arr[middleIndex]) {
                return middleIndex;
            }
            if (element < arr[middleIndex]) {
                return binarySearch(arr, element, sIndex, middleIndex - 1);
            }
            return binarySearch(arr, element, middleIndex + 1, lIndex);
        }
        //FOR DESC;
        else {
            if (element == arr[middleIndex]) {
                return middleIndex;
            }
            if (element < arr[middleIndex]) {
                return binarySearch(arr, element, middleIndex + 1, lIndex);
            }

            return binarySearch(arr, element, sIndex, middleIndex - 1);
        }
    }

    private static int fibo(int i) {

        if(i<2){
            return i;
        }
        return fibo(i-1)+fibo(i-2);
    }

    static int sumOfNumber(int n){

        if (n == 0) {
            return 0;
        }

        return n + sumOfNumber(n-1);
    }




}
