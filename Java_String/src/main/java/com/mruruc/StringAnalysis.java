package com.mruruc;

public class StringAnalysis {
    public static void main(String[] args) {

        //indexOf(String str): Returns the index of the first occurrence of the specified substring.

        System.out.println("waflo maflooma".indexOf("ma"));

        //lastIndexOf(String str): Returns the index of the last occurrence of the specified substring.
        System.out.println("waflo maflooma".lastIndexOf("ma"));

        //matches(String regex): Checks if this string matches the given regular expression.

        String text="I am studying the String chapter in java.";

        // Define your regular expression
        String regex = "[a-z .]*"; // this regex checks for lowercase letters, spaces, and periods

        // Test the matches method
        boolean result = text.matches(regex);

        // Output the result
        System.out.println("Does the text match the regex? " + result);
        String str = "Hello 🌍";
        System.out.println(str);
        str.codePoints().forEach(cp -> System.out.println(Integer.toHexString(cp) + " "));

        //join(CharSequence delimiter, CharSequence... elements) - returns a new String composed of copies of the CharSequence
       // elements joined together with a copy of the specified delimiter.

        String[] words = {"Java", "Python", "C++", "JavaScript"};
        String join = String.join(", ", words);
        System.out.println(join);

        //format() - returns a formatted string using the specified format string and arguments.
        String str2 = String.format("My name is %s and I am %d years old", "Omer", 30);
        System.out.println(str2);
        System.out.println(String.format("Hello my %s i would like to invite meeting you at %d","Friends",12));

    }
}
