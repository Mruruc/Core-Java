package com.mruruc;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<String> list1=new ArrayList<>();
        list1.add("Wafloo");
        list1.add("Sipoo");
        printList(list1);

        List<Integer> list2=new ArrayList<>();
        list2.add(56);
        list2.add(49);
        printList(list2);


    }

    private static <T> void printList(List<T> list) {
        System.out.println(list);

    }        //both are work on same way.

//    private static  void printList(List<?> list) {
//        System.out.println(list);
//
//    }
}
