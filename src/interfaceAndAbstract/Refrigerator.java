package interfaceAndAbstract;

public class Refrigerator extends Appliance {

    @Override
    void makeSound() {
        System.out.println("hmmmmmmmm");
    }

    @Override
    void doWork() {
        System.out.println("make things not hot");
    }

}
