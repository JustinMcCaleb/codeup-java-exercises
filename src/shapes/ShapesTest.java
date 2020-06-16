package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        //Test code from inheritance and polymorphism exercise
            //        Rectangle box1 = new Rectangle(5, 4);
            //
            //        System.out.println("Box1 perimeter: " + box1.getPerimeter());
            //        System.out.println("Box1 area: " + box1.getArea());
            //
            //
            //        Rectangle box2 = new Square(5);
            //
            //        System.out.println("Box2 perimeter: " + box2.getPerimeter());
            //        System.out.println("Box2 area: " + box2.getArea());



        //Test code for interfaces and abstract classes

                Measurable myShape;

                myShape = new Square(10);

                System.out.println(myShape.getPerimeter());
                System.out.println(myShape.getArea());

                System.out.println();

                myShape = new Rectangle(2, 3);
                System.out.println(myShape.getPerimeter());
                System.out.println(myShape.getArea());


                //Answers to exercise questions

                //Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?

                    //getPerimeter is an abstract method (implied bc in an interface) so it has to be overridden

                //What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?

                    //they do not work because myShape has the Measurable data type and Measurable does not have access to the methods in Quadrilateral

    }
}
