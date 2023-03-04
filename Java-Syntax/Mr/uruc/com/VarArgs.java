import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {

        int [] a={1,2,45,7,88};
        method(a);
    }
    static void method(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
