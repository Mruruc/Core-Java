package Mr.uruc.com;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a String:");
        String inputString=scan.nextLine();
        System.out.println(inputString);

        System.out.println("Enter a floating number;");
        float inputFloat=scan.nextFloat();
        System.out.println(inputFloat);


        System.out.println("Enter a integer number:");
        int inputInteger=scan.nextInt();
        System.out.println(inputInteger);

        //for other data type:

 //       byte inputByte=scan.nextByte();        //for byte input.
//        short inputShort=scan.nextShort();     //for short input.
//        boolean inputBoolean=scan.nextBoolean();  //for boolean input.
//        double inputDouble=scan.nextDouble();   //for double input.
//        long inputLong=scan.nextLong();       //for long input.

    }
}
