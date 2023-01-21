package Java_Exception_handling;

public class Try_Catch4 {
    private static int[] accountNo = {1001, 1002, 1003, 1004,1005};
    private static String name[] =
            {"Ali", "Veli", "Suat", "Ela", "Gamze"};
    private static double balance[] =
            {100.00, 12000.00, 5000.0, 999.00, 1100.55};

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(accountNo[i] + "\t" + name[i] +
                    "\t" + balance[i]);
        }
        System.out.println("==========================================");


        try {
            System.out.println("ACCOUNTNO" + "\t" + "CUSTOMER NAME" +
                    "\t" + "BALANCE");
            // display the actual account information
            for (int i = 0; i < 5; i++) {
                System.out.println(accountNo[i] + "\t" + name[i] +
                        "\t" + balance[i]);

                // display own exception if balance < 1000
                 if (balance[i] < 1000) {
                     System.out.print(name[i]+"---->>>");
                    MyException me =
                            new MyException("Balance is less than 1000 ! ");
                    throw me;
                }
            }
        } //end of try
        catch (MyException e) {
            //System.out.println("Your balance is less than 1000");
            //System.out.println(e.toString());
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("==================================");

          // we can not use our customize exception class onto exist exception;
       /* try {
            String str = "";
            System.out.println(str.charAt(5));

            MyException exception=new MyException("You are trying to access not exist element");
            throw exception;
        } catch (MyException e) {
            e.getCause();
        }*/




    }
}
