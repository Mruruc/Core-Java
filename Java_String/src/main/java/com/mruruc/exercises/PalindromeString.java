package com.mruruc.exercises;

import java.util.HashMap;
import java.util.Map;

public class PalindromeString {

    public boolean palindrome(String input){
        char[] charArray = input.toCharArray();
        int firstIndex=0;
        int lastIndex=charArray.length-1;

        while(firstIndex <= lastIndex){
            if(charArray[firstIndex] != charArray[lastIndex]){
                return false;
            }
            lastIndex--;
            firstIndex++;
        }
        return true;
    }

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }

        String A=a.toUpperCase();
        String B=b.toUpperCase();

        Map<Character,Integer> mapA=new HashMap<>();
        Map<Character,Integer> mapB=new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char charA = Character.toUpperCase(a.charAt(i));
            char charB = Character.toUpperCase(b.charAt(i));

            mapA.put(charA, mapA.getOrDefault(charA, 0) + 1);
            mapB.put(charB, mapB.getOrDefault(charB, 0) + 1);
        }

        return mapA.equals(mapB);
    }

}
