package com.mruruc.Algorithm;

public class OddEvenBitwise {

      /*
         ex: (1011 =>  2^0 * 1) + ( 2^1 * 1) + (2^2 * 0) + (2^3 * 1) =11
               T   =      T    +       C      +    C     +    C
                if last digit of binary number =1, number is Odd.
                else last digit is must be 0 so number is Even.

         ex: a number &(and) 1:
              if(last digit of number is ==0){
                   number is 0;
              }

              if(last digit of number is ==1){
                   number is 1;
              }

                10010
                00001
             &_________
                00000

                10011
                00001
             &_________
                00001
        */

    private static void Odd_Or_Even(int number) {
        if((number & 1)==1){
            System.out.println("Your number is Odd!");
        }
        else if((number & 1)==0){
            System.out.println("Your number is Even!");
        }
    }
    public static boolean is_Odd(int number) {
        return (number & 1) ==1;
    }
    public static boolean is_Even(int number) {
        return (number & 1) ==0;
    }

}
