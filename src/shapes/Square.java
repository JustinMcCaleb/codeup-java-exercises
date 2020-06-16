package shapes;

public class Square extends Quadrilateral {

    //Code from inheritance and polymorphism exercise
        //    public Square(double side) {
        //        super(side, side);
        //    }
        //
        //    public double getArea() {
        //        return Math.pow(width, 2);
        //    }
        //
        //    public double getPerimeter() {
        //        return 4 * width;
        //    }



    //Interfaces and Abstract Classes exercise


            public Square(double side) {
                super(side, side);
            }


            @Override
            void setLength(double length) {
                this.length = length;
                this.width = length;
            }

            @Override
            void setWidth(double width) {
                this.width = width;
                this.length = width;
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
