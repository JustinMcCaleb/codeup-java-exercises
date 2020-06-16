package interfaceAndAbstract;

public class Blender extends Appliance {

    @Override
    void makeSound() {
        System.out.println("WAHahaAHAhahaAHAHAHhahaAHHa");
    }

    @Override
    void doWork() {
        System.out.println("make things not big");
    }
}
