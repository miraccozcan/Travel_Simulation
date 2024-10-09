// AirplaneAdapter.java
public class AirplaneAdapter implements IVehicle {
    private Airplane airplane;

    public AirplaneAdapter(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public void addFuel(double amount) {
        airplane.airplaneAddFuel(amount);
    }

    @Override
    public void travel(double distance) {
        airplane.airplaneTravel(distance);
    }

    @Override
    public double getDistance() {
        return airplane.getAirplaneDistance();
    }

    @Override
    public double getTime() {
        return airplane.getAirplaneTime();
    }

    @Override
    public double getFuelLevel() {
        return airplane.getAirplaneFuelLevel();
    }

    @Override
    public double getFuelCost() {
        return airplane.getAirplaneFuelCost();
    }
}
