package com.mruruc;

import com.mruruc.exercises.ArrayToString;
import com.mruruc.exercises.PalindromeString;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        PalindromeString palindromeString=new PalindromeString();
       // boolean madam = palindromeString.palindrome("nmadamn");
        //System.out.println(madam);

       // System.out.println(PalindromeString.isAnagram("anagramm","managar"));

        /*
        int[] arr={4,9,9,3,1};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

         */


        String[] array= {"hello", "world", "this", "is", "great"};
        String s = ArrayToString.arrToString(array);
        System.out.println(s);

    }
}