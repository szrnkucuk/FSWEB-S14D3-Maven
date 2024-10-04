package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
        this.name = "";
        this.description = "";
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void startEngine() {
        System.out.println(name + " engine is starting...");
    }

    public void drive() {
        System.out.println(name + " is now driving...");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Engine is running with basic configuration.");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
