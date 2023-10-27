package org.example.exercises;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Car car1=new Car(165,250,"Ford");

        car1.state();


        car1.increase();
        car1.increase();
        car1.decrease();
        car1.state();

        int[]arr={-1,8,-6,3,0,-99};
        Arrays.stream(arr).forEach(e->System.out.print(e +" "));
        System.out.println();
        changeSign(arr);

        Arrays.stream(arr).forEach(e->System.out.print(e +" "));
        System.out.println();
    }


    public static void changeSign(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i] < 0 ? arr[i] * -1 : arr[i];
        }
    }

}
