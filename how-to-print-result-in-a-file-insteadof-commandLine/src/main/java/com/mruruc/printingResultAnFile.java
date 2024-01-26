package com.mruruc;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printingResultAnFile {
    static String sayHello(){
        return "Hello Java.io.*";
    }

    static void fill2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=(int)(Math.random()*10);
            }
        }
    }


    public static void main(String[] args) throws FileNotFoundException {

            PrintWriter writer = new PrintWriter("com/mruruc/output.txt");

            writer.println(sayHello());
            writer.println("=========================");
            int[][] arr=new int[5][5];
            fill2DArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                writer.print(arr[i][j]+" ");
            }
            writer.println("\n");
        }

            writer.close();

    }
}
