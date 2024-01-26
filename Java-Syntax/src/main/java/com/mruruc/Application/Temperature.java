package Mr.uruc.com.Application;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double tempC = scan.nextDouble();

        double tempF = (tempC * 9 / 5) + 32;
        System.out.println(tempF);

    }
}
