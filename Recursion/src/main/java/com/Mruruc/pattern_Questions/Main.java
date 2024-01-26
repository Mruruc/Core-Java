package com.Mruruc.pattern_Questions;

public class Main {
    static void pattern1(int row,int column){
        if(row==0){
           return;
        }
        if(row > column) {
            System.out.print("*");
            pattern1(row,column+1);
        }
        else{
            System.out.println();
            pattern1(row-1,0);

        }
    }
    private static void pattern2(int row, int column,int counter) {
        if(row==counter){
            return;
        }
        if(row>column){
            System.out.print("*");
            pattern2(row,column+1,counter);
        }
        else{
            System.out.println();
            pattern2(row+1,0,counter);
        }

    }
    public static void main(String[] args) {

        pattern1(5,0);

    /*    int counter=5;
        while(counter!=0){
            for (int i =1; i <=counter; i++) {
                System.out.print("*");
            }
            System.out.println();
            counter--;
        }*/

    }


}
