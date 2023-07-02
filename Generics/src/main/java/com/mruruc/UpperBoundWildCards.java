package com.mruruc;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class UpperBoundWildCards {
    public static void main(String[] args) {



        List<Double> list1=new ArrayList<>();
        list1.add(5.22);
        list1.add(0.59);
        printList(list1);

        List<Integer> list2=new ArrayList<>();
        list2.add(56);
        list2.add(49);
        printList(list2);


    }
     private static <T> void printAnyThing(List<T> list){
         System.out.println(list);
     }
    private static void printList(List<? extends Number> list) {

        System.out.println(list);
    }

}
