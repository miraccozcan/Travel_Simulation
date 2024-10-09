// TravelSimulation.java
public class TravelSimulation {
    public static void main(String[] args) {
        Boat boat = new Boat();
        Car car = new Car();
        Airplane airplane = new Airplane();

        IVehicle boatAdapter = new BoatAdapter(boat);
        IVehicle carAdapter = new CarAdapter(car);
        IVehicle airplaneAdapter = new AirplaneAdapter(airplane);

        boatAdapter.travel(100.0);
        VehicleUtility.printVehicleInformation(boatAdapter, "Boat");

        carAdapter.travel(1000.0);
        VehicleUtility.printVehicleInformation(carAdapter, "Car");

        airplaneAdapter.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplaneAdapter, "Airplane");

        System.out.println("\nAdding fuel...\n");
        boatAdapter.addFuel(120);
        carAdapter.addFuel(40);
        airplaneAdapter.addFuel(50000);

        boatAdapter.travel(100.0);
        VehicleUtility.printVehicleInformation(boatAdapter, "Boat");

        carAdapter.travel(1000.0);
        VehicleUtility.printVehicleInformation(carAdapter, "Car");

        airplaneAdapter.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplaneAdapter, "Airplane");

        new java.util.Scanner(System.in).nextLine();
    }
}
