package com.mruruc;

public class StringTransformation {

    public static void main(String[] args) {

        String sentence=" I am working on Strings";


        //split(String regex) - returns an array of strings computed,
        // by splitting this string around matches of the given regular expression.
        String [] array=sentence.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        String [] array2=sentence.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("===================================================");


        //getBytes() - encodes this string into a sequence of bytes using the platform's default charset.
        byte[] bytes=sentence.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char)bytes[i]+" ");
        }
        System.out.println();

        System.out.println("=========================================");

        char[] charArray = sentence.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }


    }
}
