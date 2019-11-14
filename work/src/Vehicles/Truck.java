package Vehicles;

public class Truck extends Vehicle {


    private static final double SUMMER_MODE = 1.6;

    public Truck(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm);
    }


    @Override
    protected void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        super.setFuelConsumptionPerKm(fuelConsumptionPerKm + SUMMER_MODE);
    }

    @Override
    public void refuel(double fuelQuantity) {
        double realFuelQuantity = fuelQuantity - ((fuelQuantity * 5) / 100);
        super.refuel(realFuelQuantity);
    }
}


