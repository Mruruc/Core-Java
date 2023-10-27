package org.example;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        /*
        String name1 = "John";

        //  System.out.println( name1 == "John");

        String name2 = "John";

        // System.out.println(name1.equals("John"));

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));

        var x = new String("Veli");
        var y = new String("John");

        System.out.println(name1 == y);



        int x=1;

        System.out.println(x++);
        System.out.println(++x);



        Scanner scanner= new Scanner(System.in);

        String country=scanner.nextLine();

        switch (country){
            case "Poland" -> System.out.println("Dzindobry");
            case "Brazil" -> System.out.println("Hola");
            case "Germany" -> System.out.println("Guutan morgann");

            default -> System.out.println("Unknown");
        }



        int [] arr={2,9,6,7,31,8};
        int[] arr2=new int[arr.length +5];


        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }

        for (int element: arr2) {
            System.out.print(element +" ");
        }




         */


        int result = fib(8);
        System.out.println(result);


    }

    static int fib(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }

        return fib(x - 2) + fib(x - 1);
    }
}