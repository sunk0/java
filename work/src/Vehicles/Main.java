package Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.text.DecimalFormat;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(input[1]), Double.parseDouble(input[2]));
        String[] input1 = reader.readLine().split("\\s+");

        Vehicle truck = new Truck(Double.parseDouble(input1[1]), Double.parseDouble(input1[2]));

        int n = Integer.parseInt(reader.readLine());

        DecimalFormat format = new DecimalFormat("#.##");
        while (n-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            String command = tokens[0];
            String obj = tokens[1];
            double distanceOrLitters = Double.parseDouble(tokens[2]);


            if ("Drive".equals(command)) {
                if ("Car".equals(obj)) {
                    boolean isDriven = car.drive(distanceOrLitters);
                    if (isDriven) {
                        //       System.out.printf("Car travelled %.2f%n",distanceOrLitters);

                        System.out.println(String.format("Car travelled %s km", format.format(distanceOrLitters)));
                    } else {

                        System.out.println("Car needs refueling");
                    }
                } else {
                    boolean isDriven = truck.drive(distanceOrLitters);
                    if (isDriven) {
                        System.out.println(String.format("Truck travelled %s km", format.format(distanceOrLitters)));
                    } else {
                        System.out.println("Truck needs refueling");
                    }
                }
            } else {
                if ("Car".equals(obj)) {
                    car.refuel(distanceOrLitters);
                } else {
                    truck.refuel(distanceOrLitters);
                }
            }

        }
        System.out.printf("Car: %.2f", Math.round(car.fuelQuantity * 100.0) / 100.0);
        System.out.println();
        System.out.printf("Truck: %.2f", Math.round(truck.fuelQuantity * 100.0) / 100.0);
    }
}
