package Vehicles;

public abstract class Vehicle {
    public double fuelQuantity;
    public double fuelConsumptionPerKm;


    protected Vehicle(double fuelQuantity, double fuelConsumptionPerKm) {

        setFuelQuantity(fuelQuantity);
        setFuelConsumptionPerKm(fuelConsumptionPerKm);
    }

    protected void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public boolean drive(double distance) {
        double neededFuel = distance * this.fuelConsumptionPerKm;
        if (this.fuelQuantity < neededFuel) {
            return false;
        }
        this.fuelQuantity -= neededFuel;
        return true;


    }


    public void refuel(double fuelQuantity) {
        this.fuelQuantity += fuelQuantity;
    }

    @Override
    public String toString() {
        return String.format("%.2f", this.fuelQuantity);
    }
}
