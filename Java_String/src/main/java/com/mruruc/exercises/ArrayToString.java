package com.mruruc.exercises;

public class ArrayToString {

    public static String arrToString(String... words){

        String result= "";

        for (int i = 0; i <words.length; i++) {
            result +=words[i]+" ";
        }

        return result.trim();
    }

}
