package com.mruruc.Algorithm;

public class FindingUniqueElementInArray {
    public static int uniqueElement(int[] arr){
        int unique=0;
        for (int i = 0; i < arr.length; i++) {
            unique=unique ^ arr[i];
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr={1,5,6,5,1,6,2};
        System.out.println(uniqueElement(arr));
    }
}
