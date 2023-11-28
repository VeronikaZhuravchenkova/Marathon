package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfIssue(2000);
        System.out.println(car.yearDifference(2023));
        car.info();

    }
}
