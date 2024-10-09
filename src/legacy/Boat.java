// legacy/Boat.java
public class Boat {
    private static final double CAPACITY = 150.0; // 150L of fuel
    private static final double FUEL_CONSUMPTION = 20.0; // 20L/hour
    private static final double DOLLARS_PER_LITRE = 1.69; // $1.69/L of fuel
    private static final double SPEED = 20.0; // averages 20.0km/hour
    private double fuel = CAPACITY;
    private double totalDistance = 0.0;

    public void boatAddFuel(double amount) {
        fuel += amount;
        if (fuel > CAPACITY) {
            System.out.println("Fuel overflow, capping at " + CAPACITY + "L.");
            fuel = CAPACITY;
        }
    }

    public double getBoatDistance() {
        return totalDistance;
    }

    public double getBoatTime() {
        return totalDistance / SPEED;
    }

    public double getBoatFuelLevel() {
        return fuel;
    }

    public double getBoatFuelCost() {
        return FUEL_CONSUMPTION * getBoatTime() * DOLLARS_PER_LITRE;
    }

    public void boatTravel(double distance) {
        double time = distance / SPEED;
        double maxTime = fuel / FUEL_CONSUMPTION;
        if (maxTime < time) {
            double maxDistance = maxTime * SPEED;
            System.out.println("Not enough fuel to travel " + distance + "km. Travelling " + maxDistance + "km instead.");
            totalDistance += maxDistance;
            fuel = 0.0;
        } else {
            totalDistance += distance;
            fuel -= time * FUEL_CONSUMPTION;
        }
    }
}
