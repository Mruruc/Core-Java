package com.mruruc.zoo;

import static com.mruruc.zoo.Animal.Gender.FEMALE;
import static com.mruruc.zoo.Animal.Gender.MALE;

public class Zoo {
    public static void main(String[] args) throws GenderNotMatchExceptions {
     Cage<Deer> cage1=new Cage<>();

     try {
         cage1.putIntoCage(new Deer(MALE));
         cage1.putIntoCage(new Deer(FEMALE));
     //    cage1.putIntoCage(new Deer(MALE));
     }
     catch (GenderNotMatchExceptions e){
         System.out.println(e.getMessage());
     }
     catch (CageFullException e){
         System.out.println(e.getMessage());
     }
     finally {
         System.out.println("The Code work!");
     }

     Cage<Lion> lions=new Cage<>();
     Lion male=new Lion(MALE);
     Lion female=new Lion(FEMALE);
        boolean compatible = Cage.isCompatible(male, female);
        System.out.println(compatible);

    }
}
