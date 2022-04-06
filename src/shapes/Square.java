package shapes;

public class Square extends Quadrilateral{
    public Square(double side){
        super.length = side;
        super.width = side;
    }


    public void setLength(double length) {
            this.length = length;
            this.width = length;
    }


    public void setWidth(double width) {
        this.width = width;
        this.length =width;
    }

    public double getPerimeter(){

        return 4 * super.length;
    }

    public double getArea(){
        return length * width;
    }


}
