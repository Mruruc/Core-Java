package Java_Exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch2 {
    public static void main(String[] args) {

        int[] array = new int[5];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number that you want to find out the Avg.");
        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = scan.nextInt();
            }
        } catch (InputMismatchException exception) {
            System.out.println("Enter just Integer number !");
        }
        /*catch(){} we can have more than one catch statement.*/
        finally {
            scan.close();
        }

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp = temp + array[i];
        }


        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Here are your number's Average;" + temp / array.length);
    }


}
