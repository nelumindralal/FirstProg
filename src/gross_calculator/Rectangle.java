package gross_calculator;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;

    }

    public Rectangle(double width, double length){
        setLength(length);
        setWidth(width);

    }

    public double calculatePerimeter() {
        return (2 * width) + (2 * length);
    }

    public double calculateArea(){
        return width*length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }


}
