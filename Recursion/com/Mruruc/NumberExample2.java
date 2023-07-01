package com.Mruruc;

public class NumberExample2 {
    public static void main(String[] args) {

        print2(1);

    }

    private static void print1(int n) {

        System.out.println(n);

        if(n==5){                //as long as n != 5 function will call itself.
            return;              //if n=5 function will be terminated via return statement.
        }
        print1(n+1);

    }
    private static void print2(int n) {

        int counter=0;
        System.out.println(n);
        counter++;

        //Base condition;
        //it is stopped function to call itself:
        if(counter==5){
                                 //as long as counter != 5 function will call itself.
           return;              //if counter=5 function will be terminated via return statement.
        }
        print1(n+1);

    }

}
