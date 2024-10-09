// BoatAdapter.java
public class BoatAdapter implements IVehicle {
    private Boat boat;

    public BoatAdapter(Boat boat) {
        this.boat = boat;
    }

    @Override
    public void addFuel(double amount) {
        boat.boatAddFuel(amount);
    }

    @Override
    public void travel(double distance) {
        boat.boatTravel(distance);
    }

    @Override
    public double getDistance() {
        return boat.getBoatDistance();
    }

    @Override
    public double getTime() {
        return boat.getBoatTime();
    }

    @Override
    public double getFuelLevel() {
        return boat.getBoatFuelLevel();
    }

    @Override
    public double getFuelCost() {
        return boat.getBoatFuelCost();
    }
}
