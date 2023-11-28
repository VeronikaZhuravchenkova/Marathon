package day9;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(double width, double length, String color ) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;

    }

    @Override
    public double perimeter() {
        return width + width + length + length;
    }
}
