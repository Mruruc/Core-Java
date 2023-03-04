package String_Java;

public class SString {

    public static void main(String[] args) {

        String sentence=" I am working on Strings";

        //charAt(int index) - returns the character at the specified index.
        System.out.println(sentence.charAt(5));
        //length() - returns the length of the string.
        System.out.println(sentence.length());
        //substring(int beginIndex, int endIndex) - returns a new string that is a substring of this string.
        System.out.println(sentence.substring(5,12));
        //substring(int beginIndex) - returns a new string that is a substring of this string.
        System.out.println(sentence.substring(5));
        //toLowerCase() - returns the string in lowercase.
        System.out.println(sentence.toLowerCase());
        //toUpperCase() - returns the string in uppercase.
        System.out.println(sentence.toUpperCase());
        //trim() - removes first and last whitespace.
        System.out.println(sentence.trim());
        //startsWith(String prefix) - returns true if the string starts with the specified prefix.
        System.out.println(sentence.startsWith(" "));
        System.out.println(sentence.startsWith("I"));
        //endsWith(String suffix) - returns true if the string ends with the specified suffix.
        System.out.println(sentence.endsWith("s"));
        //contains(CharSequence s) - returns true if the string contains the specified sequence of char values.
        System.out.println(sentence.contains("am"));
        //replace(char oldChar, char newChar) - returns a new string resulting from replacing,
        // all occurrences of oldChar in this string with newChar.
        System.out.println(sentence.replace('i','k'));
        //indexOf(String str) - returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(sentence.indexOf("S"));
        System.out.println(sentence.indexOf("s"));
        System.out.println(sentence.indexOf("n"));
        //lastIndexOf(String str) - returns the index within this string of the last occurrence of the specified substring.
        System.out.println(sentence.lastIndexOf("on"));
        System.out.println(sentence.lastIndexOf("am"));
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
        //isEmpty() - returns true if, and only if, length() is 0.
        System.out.println(sentence.isEmpty());
        //format() - returns a formatted string using the specified format string and arguments.
        String str = String.format("My name is %s and I am %d years old", "Omer", 30);
        System.out.println(str);
        System.out.println(String.format("Hello my %s i would like to invite meeting you at %d","Friends",12));

      // concat(String str) - concatenates the specified string to the end of this string.
        System.out.println("Hello".concat("Mamo"));
        //getBytes() - encodes this string into a sequence of bytes using the platform's default charset.
        byte[] bytes=sentence.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]+" ");
        }
        System.out.println();
        //valueOf(primitive data type x) - returns the string representation of the passed argument's data type value.
        double pi=0.11;
        String str=String.valueOf(pi);
        System.out.println(str);


        //equals(Object anObject) - compares this string to the specified object.
       // equalsIgnoreCase(String anotherString) -
        // compares this String to another string, ignoring case considerations
        String str1="Hello world";
        String str2=new String("Hello world");
        String str3=new String("Hello world");
        String str4=new String("Hello Dinyee");
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        String a="HEllO wOrLD";
        System.out.println(str1.equalsIgnoreCase(a));


        //compareTo(String anotherString) - compares two strings lexicographically
//compareToIgnoreCase(String str) - compares two strings lexicographically, ignoring case differences
//matches(String regex) - tells whether or not this string matches the given regular expression
//replaceFirst(String regex, String replacement) - replaces the first substring of this string
// that matches the given regular expression with the given replacement
//replaceAll(String regex, String replacement) - replaces each substring of this string
// that matches the given regular expression with the given replacement
//join(CharSequence delimiter, CharSequence... elements) - returns a new String composed of copies of the CharSequence
// elements joined together with a copy of the specified delimiter.
//repeat(int count) - returns a string whose value is this string repeated count times
//codePoints() - returns a stream of int zero-extending the char values from this sequence.



    }
}
