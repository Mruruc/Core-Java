package Mr.uruc.com.Application;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number:");
        int input=scan.nextInt();

        int result=0;
        while(input > 0){
            int rem=input % 10;
            input=input/10;

            result=result *10 +rem;
        }
        System.out.println(result);
    }
}
