package org.example.company;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name){
        super(cylinders,name);
    }
    public String startEngine() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car's miths engine is starting";
    }

    public String accelerate() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car mitsh is accelerating";
    }

    public String brake() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car miths is braking";
    }
}
