package com.mruruc;

public class BasicStringOperations {
    public static void main(String[] args) {

        //valueOf(primitive data type x) - returns the string representation of the passed argument's data type value.
        double pi=0.11;
        String str=String.valueOf(pi);
        System.out.println(str);


        // charAt(int index): Returns the character at the specified index.
        String test=" teST ing ";
        System.out.println(test.charAt(0));
        System.out.println(test.charAt(test.length()-1));
        System.out.println("===================length()====================");
        //length(): Returns the length of the string.
        System.out.println(test.length());

        System.out.println("=============toLowerCase()=&=toUpperCase()===================");
        //toLowerCase(): Converts the string to lowercase.
        //toUpperCase(): Converts the string to uppercase.
        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());

        System.out.println("============trim()=================");
        //trim() - removes first and last whitespace.
        System.out.println(test.trim());

        System.out.println("================== concat(String str)=======================");
      //  concat(String str): Concatenates the specified string to the end of this string.
        System.out.println(test.concat("concatStr"));

        System.out.println("==================isEmpty()=======================");
        //isEmpty(): Checks if the string is empty (length is 0)
        System.out.println(test.isEmpty());
        System.out.println(" ".isEmpty()); // whitespace is computed as a character of the string.

        System.out.println("==================substring(int beginIndex, int endIndex):=======================");
        //substring(int beginIndex, int endIndex): Returns a substring of this string.
        System.out.println(test.substring(1,4));
        //substring(int beginIndex): Overloaded method for substring.
        System.out.println(test.substring(0));
        System.out.println("================== isBlank()=======================");
        System.out.println(" bla nk  ".isBlank());

    }
}
