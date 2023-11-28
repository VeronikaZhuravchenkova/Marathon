package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2019,"Green", "BMW");

        System.out.println(motorbike.getYearOfIssue());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getModel());
    }
}
