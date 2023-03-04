package Mr.uruc.com.Application;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input=scan.nextInt();

        int first=0;
        int second=1;
        int count=2;

        while(count<=input){
            int temp=second;
            second=second+first;
            first=temp;
            count++;
        }
        System.out.println(second);

    }
}
