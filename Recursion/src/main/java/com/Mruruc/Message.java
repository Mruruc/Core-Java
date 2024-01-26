package com.Mruruc;

public class Message {
    public static void main(String[] args) {
        message1();
    //  message2();
     // message3();
     //   message4();
    }

    static void message1(){
       // System.out.println("Hello Recursion 1 ");
        //message1(); StackOverflow
        message2();
        message3();
        message4();
    }
    static void message2(){
        System.out.println("Hello Recursion 2");
    }
    static void message3(){
        System.out.println("Hello Recursion 3");
    }
    static void message4(){
        System.out.println("Hello Recursion 4");
    }

}
