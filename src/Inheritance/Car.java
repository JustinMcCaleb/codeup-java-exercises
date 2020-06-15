package Inheritance;

public class Car extends Vehicle {

    private int milesPerGallon;

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int MPG) {
        this.milesPerGallon = MPG;
    }

    public Car() {super();}

    public Car(boolean operable, int capacity, String source, int MPG) {
        super(operable, capacity, source);
        this.milesPerGallon = MPG;
    }

    public void deployAirbag() {
        System.out.println("Deploying airbag...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "milesPerGallon=" + milesPerGallon +
                "} " + super.toString();
    }

    public void turnOn() {
        System.out.println("Cranking engine...");
    }

    public void genericTurnOn () {
        super.turnOn();
    }
}
