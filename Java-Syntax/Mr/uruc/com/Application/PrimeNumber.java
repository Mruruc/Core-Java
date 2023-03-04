import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a  number:");
        int num = scan.nextInt();
        int check = 2;

        while (Math.pow(check,2) < num) {
            if (num == 2) {
                System.out.println(num + " ïs prime number.");
                return;
            }
            if (num % check == 0) {
                System.out.println(num + " is not prime number.");
                return;
            }
            check++;
        }
        System.out.println(num + " is a prime number.");
    }
}
