package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input in = new Input();

        System.out.println("Please enter a number: ");

        double radius = in.getDouble();

        Circle c = new Circle(radius);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
    }
}
