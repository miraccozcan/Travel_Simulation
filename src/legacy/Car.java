// legacy/Car.java
public class Car {
    private static final double CAPACITY = 50.0; // 50L of fuel
    private static final double FUEL_EFFICIENCY = 8.9; // 8.9L/100km
    private static final double DOLLARS_PER_LITRE = 1.59; // $1.59/L of gas
    private static final double SPEED = 60.0; // averages 60km/hour
    private double fuel = CAPACITY;
    private double totalDistance = 0.0;

    public void carAddFuel(double amount) {
        fuel += amount;
        if (fuel > CAPACITY) {
            System.out.println("Fuel overflow, capping at " + CAPACITY + "L.");
            fuel = CAPACITY;
        }
    }

    public double getCarDistance() {
        return totalDistance;
    }

    public double getCarTime() {
        return totalDistance / SPEED;
    }

    public double getCarFuelLevel() {
        return fuel;
    }

    public double getCarFuelCost() {
        return totalDistance * FUEL_EFFICIENCY / 100.0 * DOLLARS_PER_LITRE;
    }

    public void carTravel(double distance) {
        double maxDistance = fuel / (FUEL_EFFICIENCY / 100.0);
        if (maxDistance < distance) {
            System.out.println("Not enough fuel to travel " + distance + "km. Travelling " + maxDistance + "km instead.");
            totalDistance += maxDistance;
            fuel = 0.0;
        } else {
            totalDistance += distance;
            fuel -= distance * FUEL_EFFICIENCY / 100.0;
        }
    }
}
