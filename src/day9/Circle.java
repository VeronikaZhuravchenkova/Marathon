package day9;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double area() {
        return 3.14 * Math.pow(radius,radius);

    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;

    }
}
