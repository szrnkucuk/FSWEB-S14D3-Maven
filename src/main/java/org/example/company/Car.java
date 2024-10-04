package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
   private int cylinders;
   private String name;
   private int wheels;

   public Car(int cylinders, String name){
       this.engine=true;
       this.cylinders=cylinders;
       this.name=name;
       this.wheels=wheels;
   }
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println( "className:" + getClass().getSimpleName());
        return "the car is braking";
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, cylinders);
    }
    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + "}";
    }


}
