package shapes;

abstract class Quadrilateral extends Shape implements Measurable {


    protected double length;
    protected double width;

//    public Quadrilateral() {}

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Getters for length and width
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    //abstract setters for length and width
    public abstract void setLength(double length);
    public abstract void setWidth(double width);
}
