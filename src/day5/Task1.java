package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYearOfIssue(2020);
        car.setColor("Black");
        car.setModel("Audi");

        System.out.println(car.getYearOfIssue());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }
}
