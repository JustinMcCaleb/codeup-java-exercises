package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    //Code from inheritance and polymorphism exercise
        //    protected double length;
        //    protected double width;
        //
        //    public Rectangle(double l, double w) {
        //        this.length = l;
        //        this.width = w;
        //    }
        //
        //    public double getArea() {
        //        return length * width;
        //    }
        //
        //    public double getPerimeter() {
        //        return ((2 * length) + (2 * width));
        //    }



    //Interfaces and Abstract Classes exercise


            public Rectangle(double length, double width) {
                super(length, width);
            }


            @Override
            void setLength(double length) {
                this.length = length;
            }

            @Override
            void setWidth(double width) {
                this.width = width;
            }

            @Override
            public double getPerimeter() {
                return ((2 * length) + (2 * width));
            }

            @Override
            public double getArea() {
                return length * width;
            }
}
