package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders){
        super(name, description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize=batterySize;
        this.cylinders=cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    @Override
    public void startEngine(){
        System.out.println(getName() + "HybridPoweredCar");
    }
    @Override
    protected void runEngine(){
        System.out.println("Hybrid car is running");
    }
    @Override
    public void drive(){
        System.out.println(getName() + "HybridCar is driving.");
        runEngine();
    }
}
