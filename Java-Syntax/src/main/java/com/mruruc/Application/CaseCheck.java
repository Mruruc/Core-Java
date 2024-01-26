package Mr.uruc.com.Application;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter:");
        char input = scan.next().trim().charAt(0);

        if (input >= 'a' && input <= 'z') {
            System.out.println("LowerCase");
            return;
        }
        System.out.println("UpperCase");

    }
}
