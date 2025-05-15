package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " => Starting hybrid engine (electric + " + cylinders + " cylinder fuel engine).");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " => Driving hybrid mode, battery: " + batterySize + " kWh, fuel efficiency: " + avgKmPerLitre + " km/l.");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " => Hybrid system managing electric + fuel power.");
    }
}
