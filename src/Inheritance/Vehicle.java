package Inheritance;

public class Vehicle {

    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;


    public boolean getIsOperable() {
        return isOperable;
    }

    public void setOperable(boolean operable) {
        isOperable = operable;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int capacity) {
        passengerCapacity = capacity;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String source) {
        powerSource = source;
    }

    public Vehicle() {}

    public Vehicle (boolean operable, int capacity, String source) {
        isOperable = operable;
        passengerCapacity = capacity;
        powerSource = source;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "isOperable=" + isOperable +
                ", passengerCapacity=" + passengerCapacity +
                ", powerSource='" + powerSource + '\'' +
                '}';
    }

    public void turnOn() {
        System.out.println("Vehicle is turning on...");
    }
}
