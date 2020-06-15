package Inheritance;

public class VehicleTest {
    public static void main(String[] args) {


        Vehicle vehicleA = new Vehicle(false, 1, "Dogs");

        Car carA = new Car();
        carA.setOperable(true);
        carA.setPassengerCapacity(5);
        carA.setPowerSource("Electric");

        Jet jetA = new Jet();
        jetA.setOperable(true);
        jetA.setPassengerCapacity(2);
        jetA.setPowerSource("Fuel");


        System.out.println(vehicleA.toString());
        System.out.println();
        System.out.println(carA.toString());
        System.out.println();
        System.out.println(jetA.toString());
        System.out.println();


        Jet jetB = new Jet(true, 1, "Jet Fuel", 10000);

        Car carB = new Car(true, 2, "Diesel", 32);

        System.out.println(jetB.toString());
        System.out.println();
        System.out.println(carB.toString());


    }
}
