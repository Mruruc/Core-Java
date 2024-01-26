package com.mruruc;

//compareTo(String anotherString) - compares two strings lexicographically
//compareToIgnoreCase(String str) - compares two strings lexicographically, ignoring case differences

public class StringComparison {
    public static void main(String[] args) {
        /*
        * if we want to compare the value as well as reference we should use the == comparison.
        * if we want to compare the just value we should use the .equals() method.
        * */


        String name1 = "waflo";
        String name2 = "waflo";
        String name3 = new String("waflo");
        String name4="WaFlo";


        if (name1 == name2) {
            System.out.println("Reference as wel as values are equal.");
        }


        if (name1.equals(name3)) {
            if (name1 == name3) {
                System.out.println("Reference as wel as values are equal.");
                return;
            }
            System.out.println("The values are equal but the reference are different!");
        }

        //equalsIgnoreCase(String anotherString): Compares this string to another string, ignoring case.
        System.out.println(name2.equalsIgnoreCase(name4));

        //startsWith(String prefix): Checks if the string starts with the specified prefix.
        //endsWith(String suffix): Checks if the string ends with the specified suffix.
        //contains(CharSequence s): Checks if the string contains the specified sequence of characters.

        boolean af = name3.contains("af");
        System.out.println(af);
        boolean startsWith = name3.startsWith(" ");
        boolean endsWith = name3.endsWith("o");
        System.out.println(startsWith + " " + endsWith );


    }
}
