package com.mruruc.zoo;


public class Cage<E extends Animal> {
    private E animal1;
    private E animal2;

    public void putIntoCage(E animal) throws GenderNotMatchExceptions {
        if(this.animal1 ==null){
             this.animal1=animal;
             return;
        }
        if (this.animal2 ==null) {
            this.animal2=animal;
            if(compatible(animal1,animal2)){
                this.animal2=null;
                throw new GenderNotMatchExceptions("Gender can not be same!");
            }
            return;
        }

            throw new CageFullException("Cage is Full");

    }
    public static <E extends Animal> boolean isCompatible(E animal1,E animal2){
        return animal1.getGender() != animal2.getGender();
    }

    private boolean compatible(E animal1, E animal2) {
        return animal1.getGender().equals(animal2.getGender());
    }


}
