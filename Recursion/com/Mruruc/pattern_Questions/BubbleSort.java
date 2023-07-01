package com.Mruruc.pattern_Questions;

import java.util.Arrays;

public class BubbleSort {
    //it does not work for element=0;
    static void sort(int[] arr,int row,int column){

        if(row==1){
            return;
        }

        if(row>column){
            if(arr[column]>arr[column+1]){
               int temp=arr[column];
                arr[column]=arr[column+1];
                arr[column+1]=temp;
            }
            sort(arr,row,column+1);
        } else{
            sort(arr,row-1,column+1);
        }

    }
    static  void sort2(int[] arr,int length){
        if(length==1){
            return;
        }
        for (int column = 0; column < length-1; column++) {
            if(arr[column]>arr[column+1]){
                int temp=arr[column];
                arr[column]=arr[column+1];
                arr[column+1]=temp;
            }
        }
        sort2(arr,length-1);
    }

    public static void main(String[] args) {
        int[] arr={5,3,9,7,0};

        sort2(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
