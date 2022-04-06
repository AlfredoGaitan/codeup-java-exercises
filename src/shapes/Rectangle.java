package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    protected double length;
    protected double width;

    //Default constructor:
    public Rectangle(){}

    //public Quadrilateral(){}

    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }

    public double getArea(){
        return this.length * this.width;
    }
}
