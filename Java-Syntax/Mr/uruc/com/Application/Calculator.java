package Mr.uruc.com.Application;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double result = 0;
        while (true) {
            System.out.println("Welcome:");
            System.out.println("If you want exit the calculator enter X or x:");
            System.out.println("Enter the operator:");
            char input = scan.next().trim().charAt(0);

            if (input == 'x' || input == 'X') {
                System.out.println("Good Bye ;)");
                System.exit(0);
            } else if (input == '+' || input == '-' || input == '*' || input == '/') {

                    System.out.println("Enter first number:");
                    double num1 = scan.nextDouble();
                    System.out.println("Enter second number:");
                    double num2 = scan.nextDouble();

                    if (input == '+') {
                        result = num1 + num2;
                    }
                    if (input == '-') {
                        result = num1 - num2;
                    }
                    if (input == '*') {
                        result = num1 * num2;
                    }
                    if (input == '/') {
                        result = num1 / num2;
                    }
                }

             else {
                System.out.println("Invalid operator!");
                System.out.print("Please use these operator: \t");
                System.out.println('+' + "," + '-' + "," +'*'+","+'/');
            }
            System.out.println(result);
        }

    }
}
