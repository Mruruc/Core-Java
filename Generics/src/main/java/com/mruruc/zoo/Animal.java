package com.mruruc.zoo;

public class Animal {
    private Gender gender;

    public Animal(Gender gender) {
        this.gender=gender;
    }

    public Gender getGender(){
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    enum Gender{
        MALE,FEMALE;
    }
}
