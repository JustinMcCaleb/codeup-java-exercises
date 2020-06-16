package interfaceAndAbstract;

public class CoffePot extends Appliance{

    @Override
    void makeSound() {
        System.out.println("drip drip drip drip");
    }

    @Override
    void doWork() {
        System.out.println("make go-go juice");
    }
}
