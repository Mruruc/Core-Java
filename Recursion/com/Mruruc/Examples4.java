package com.Mruruc;

public class Examples4 {

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
    private static boolean palindrome(int num) {
        int check=reverseNumber(num);
        return check==num;
    }

    public static void main(String[] args) {

        count(1111,3);
        System.out.println(counter);
    }

    static int counter = 0;
    private static int count(int num, int digit) {

        if (num == 0) {
            return 0;
        }
        int rem = num % 10;
        if (rem == digit) {
            counter++;
        }
        num = num / 10;

        return count(num, digit);
    }

}
