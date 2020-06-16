package interfaceAndAbstract;

public class ApplianceTest {
    public static void main(String[] args) {
        Appliance coffeePot = new CoffePot();

        Appliance blender = new Blender();

        Appliance refrigerator = new Refrigerator();

        coffeePot.makeSound();
        coffeePot.doWork();

        System.out.println();

        blender.makeSound();
        blender.doWork();

        System.out.println();

        refrigerator.makeSound();
        refrigerator.doWork();
    }
}
