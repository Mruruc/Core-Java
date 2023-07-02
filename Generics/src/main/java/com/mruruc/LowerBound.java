package com.mruruc;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    private static void addToNumber(List<? super Number> numbers, Number i) {
        numbers.add(i);
    }
    public static void main(String[] args) {

        List<Number> numbers=new ArrayList<>();

        addToNumber(numbers,54);
        addToNumber(numbers,2.1);

        print(numbers);

    }

    private static void print(List<Number> numbers) {
        System.out.println(numbers);
    }


}
