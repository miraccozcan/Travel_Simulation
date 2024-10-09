// TravelSimulation.java
public class TravelSimulation {
    public static void main(String[] args) {
        // Create instances of legacy vehicles
        Boat boat = new Boat();
        Car car = new Car();
        Airplane airplane = new Airplane();

        // Create adapters for each vehicle to use unified interface
        IVehicle boatAdapter = new BoatAdapter(boat);
        IVehicle carAdapter = new CarAdapter(car);
        IVehicle airplaneAdapter = new AirplaneAdapter(airplane);

        // Travel and print info for each vehicle
        boatAdapter.travel(100.0);
        VehicleUtility.printVehicleInformation(boatAdapter, "Boat");

        carAdapter.travel(1000.0);
        VehicleUtility.printVehicleInformation(carAdapter, "Car");

        airplaneAdapter.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplaneAdapter, "Airplane");

        // Add fuel to each vehicle
        System.out.println("\nAdding fuel...\n");
        boatAdapter.addFuel(120);
        carAdapter.addFuel(40);
        airplaneAdapter.addFuel(50000);

        // Travel again and print info for each vehicle
        boatAdapter.travel(100.0);
        VehicleUtility.printVehicleInformation(boatAdapter, "Boat");

        carAdapter.travel(1000.0);
        VehicleUtility.printVehicleInformation(carAdapter, "Car");

        airplaneAdapter.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplaneAdapter, "Airplane");

        // Keep console open until user presses enter
        new java.util.Scanner(System.in).nextLine();
    }
}
