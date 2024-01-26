package com.mruruc;

public class StringSearching {
    public static void main(String[] args) {

        //replace(char oldChar, char newChar) - returns a new string resulting from replacing,
        // all occurrences of oldChar in this string with newChar.

        String text="Java1234 String123 Chapter3133!";
        String replace = text.replace('a', 'i');
        System.out.println(replace);

        ///replaceAll(String regex, String replacement) - replaces each substring of this string
        // that matches the given regular expression with the given replacement
        String s = text.replaceAll("\\d+", "-NUMBER");
        System.out.println(s);

        //replaceFirst(String regex, String replacement) - replaces the first substring of this string
       // that matches the given regular expression with the given replacement
        String s1 = text.replaceFirst("\\d+", "*NUMBER*");
        System.out.println(s1);


    }
}
