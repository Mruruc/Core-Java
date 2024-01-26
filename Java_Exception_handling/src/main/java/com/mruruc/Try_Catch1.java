
package Java_Exception_handling;
import java.util.Scanner;
public class Try_Catch1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        try {
            System.out.println("Enter first number;");
            int x = scan.nextInt();
            System.out.println("Enter second number;");
            int y = scan.nextInt();
            System.out.println("Here is result of division---> " + x / y);
        }
        catch(ArithmeticException e){
            System.out.println("You can not divide a number by zero !!" +"\n"+
                    "Run program again and enter a number different than zero !");
        }

        scan.close();
        
        

    }


}
