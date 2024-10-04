package org.example.company;

public class Holden extends Car{

    public Holden(int cylinders, String name){
        super(cylinders,name);
    }
    @Override
    public String startEngine() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car's  holden engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car holden is accelerating";
    }

    public String brake() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car holden is braking";
    }

}
