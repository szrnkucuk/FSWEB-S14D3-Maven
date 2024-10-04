package org.example.company;

public class Ford extends Car{

    public Ford(int cylinders, String name){
        super(cylinders,name);
    }
    public String startEngine() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car's ford engine is starting";
    }

    public String accelerate() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car ford is accelerating";
    }

    public String brake() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car ford is braking";
    }
}
