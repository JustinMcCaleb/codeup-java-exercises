package Inheritance;

public class Jet extends Vehicle {

    private int maximumAltitude;

    public int getMaximumAltitude() {
        return maximumAltitude;
    }

    public void setMaximumAltitude(int maxAlt) {
        this.maximumAltitude = maxAlt;
    }

    public Jet() {super();}

    public Jet (boolean operable, int capacity, String source, int maxAlt) {
        super(operable, capacity, source);
        this.maximumAltitude = maxAlt;
    }

    public void takeOff() {
        System.out.println("Taking off...");
    }

    @Override
    public String toString() {
        return "Jet{" +
                "maximumAltitude=" + maximumAltitude +
                "} " + super.toString();
    }

    public void turnOn() {
        System.out.println("Igniting jet engines...");
    }

    public void genericTurnOn () {
        super.turnOn();
    }
}
