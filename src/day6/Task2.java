package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Veronika", 2020,4, 5000);

        airplane.setYear(2015);
        airplane.setWeight(4000);

        airplane.fillup(5);
        airplane.fillup(10);
        airplane.info();
    }
}
