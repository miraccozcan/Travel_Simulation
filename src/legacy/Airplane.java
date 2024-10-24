// legacy/Airplane.java
public class Airplane {
    private static final double CAPACITY = 100000.0; // 100000L of fuel
    private static final double FUEL_CONSUMPTION = 5400.0; // 5400L/hour
    private static final double DOLLARS_PER_LITRE = 0.75; // $0.75/L of fuel
    private static final double SPEED = 800.0; // averages 800.0km/hour
    private double fuel = CAPACITY;
    private double totalDistance = 0.0;

    public void airplaneAddFuel(double amount) {
        fuel += amount;
        if (fuel > CAPACITY) {
            System.out.println("Fuel overflow, capping at " + CAPACITY + "L.");
            fuel = CAPACITY;
        }
    }

    public double getAirplaneDistance() {
        return totalDistance;
    }

    public double getAirplaneTime() {
        return totalDistance / SPEED;
    }

    public double getAirplaneFuelLevel() {
        return fuel;
    }

    public double getAirplaneFuelCost() {
        return FUEL_CONSUMPTION * getAirplaneTime() * DOLLARS_PER_LITRE;
    }

    public void airplaneTravel(double distance) {
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
