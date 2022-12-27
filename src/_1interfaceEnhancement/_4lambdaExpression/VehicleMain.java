package _1interfaceEnhancement._4lambdaExpression;

public class VehicleMain {

    public static void main(String[] args) {
        System.out.println("main method");

        VehicleImpl vehicleImpl = new VehicleImpl();
        vehicleImpl.details();
        vehicleImpl.getMileage();

        Vehicle vehicle = new VehicleImpl();
        vehicle.details();
        vehicle.getMileage();
    }
}
