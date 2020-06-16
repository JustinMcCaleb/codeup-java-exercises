package interfaceAndAbstract;

abstract class Appliance {

    String brand;
    String color;

    public Appliance() {};

    public Appliance(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract void makeSound();

    abstract void doWork();
}
