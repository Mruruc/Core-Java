package com.Mruruc;

public class Example3 {


    static int num=0;
    private static int reverseNumber(int i) {
        if(i==0){
            return 0;
        }
        int rem=i%10;
        num=num*10+rem;
        i=i/10;
        reverseNumber(i);
        return num;
    }

/*    private static int reverseNumber(int t) {
        int num=0;
        int rem;

        while(t>0){
            rem = t%10;
            num = num*10 + rem;
            t = t/10;
        }
        return num;
    }*/


  /*  private static int reverseNumber(int t) {
        if (t < 10) {
            return t;
        }
        int rem = t % 10;
        int num = reverseNumber(t / 10);
        return (int) (rem * Math.pow(10, (int) Math.log10(num) + 1)) + num;
    }*/

    private static void goodPoint(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
    // goodPoint(n--); it will cause StackOverFlow because n-- means:
    // first it will pass value n, and then it will subtract.
       goodPoint(--n);    // it will work as expected.
    }


    private static int productOfDigits(int num) {
        if(num==0){
            return 1;
        }
        int rem=num % 10;
        num= num / 10;
       return rem * productOfDigits(num);
    }

    private static int sumOfDigit(int num) {
        if(num==0){
            return 0;
        }
        int rem=num %10;
        num=num/10;

        return rem +sumOfDigit(num);
    }

    private static int factorial(int n) {

        if(n<=1){
            return 1;
        }
        return  n * factorial(n-1);
    }

    private static void callNumberBothSide(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        callNumberBothSide(n-1);
        System.out.print(n+" ");
    }


}
