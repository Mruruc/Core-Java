import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int input=scan.nextInt();
        int a=input;
        int result=0;

        while(input>0){
            int rem=input %10;
            input=input/10;
            result += Math.pow(rem, 3);
        }
        if(result==a){
            System.out.println("It is Armstrong Number.");
        }
        else {
            System.out.println("It is not Armstrong Number.");
        }
    }
}
