package com.mruruc.upperboundwildcard;

import java.util.ArrayList;
import java.util.List;

public class StoreOfLaptop<T extends Laptop> {
    private List<Double> priceList=new ArrayList<>();

    public static <E> void printPriceList(List<E> list){
        System.out.println(list);
    }
    public static void main(String[] args) {
        StoreOfLaptop<Windows> shopeForWindows=new StoreOfLaptop<>();
        Windows windows=new Windows("Windows11",5500.0);
        shopeForWindows.priceList.add(windows.getPrice());
     //   System.out.println(shopeForWindows.priceList);
        printPriceList(shopeForWindows.priceList);
    //    StoreOfLaptop<Mac> mac=new StoreOfLaptop<Mac>();



    }
}
