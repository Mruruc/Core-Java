package org.example.exercises;

public class Car {

    double speed;
    double maxSpeed;
    String model;

    public Car(double speed,double maxSpeed,String model){
        if(speed < 0 || maxSpeed <0){
            throw new IllegalArgumentException("Speed Can not be less than zero!");
        }
        this.speed=speed;
        this.maxSpeed=maxSpeed;
        this.model=model;
    }

    public void increase(){
        this.speed=this.speed +10;
    }

    public  void decrease(){
        this.speed=this.speed -10;
    }

    public void state(){
        System.out.println("Your Current speed:" +this.speed +"," +
                "\n Your Max Speed:"+ this.maxSpeed +"," +
                " \n Your Model:" +this.model);
    }




}
