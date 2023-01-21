package Java_Exception_handling;

public class Try_Catch3 {
    public static void main(String[] args) {

        /*double [] array={0.21,8,9.1,55,100.1};
        System.out.println(array[8]);*/
        // it will produce this message --->>Index 8 out of bounds for length 5.
        // to warn user and make this message meaningful we use Try and Catch Block.

         try {
            double[] array = {0.21, 8, 9.1, 55, 100.1};
          //  System.out.println(array[2]); //even everything will work perfectly finally block will be executed.
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // we print a meaningful message for our user to understand well.
            System.out.println("You can invoke just exist element inside array!");
          //  e.printStackTrace(); // 1)Methods to print the Exception information:
        }
        catch(Exception e){
            System.out.println("Check your data again !");
        }
        finally{
            System.out.println("Whatever code will have exception or no "+"\n"
            +"This block will be executed");
        }

        int a=7;
        int b=0;
        try{
            System.out.println(a/b);
            //throw new ArithmeticException("you can not divide a NUMBER by Zero !!!");
        }
        catch(ArithmeticException ee){
            System.out.println("You cannot divide a number by zero");
            System.out.println(ee.toString()); //2)Methods to print the Exception information:

        }

        try {
            String str = "I am learning Exception in Java.";
            System.out.println(str.charAt(100));
        }
        catch(StringIndexOutOfBoundsException exception){
            System.out.println("You just can invoke element that String has !");
            // this method will just print only the description of exception.
            System.out.println(exception.getMessage());
        }







    }
}
