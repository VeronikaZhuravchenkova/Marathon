package day6;

public class Motorbike {
    private int yearOfIssue;
    private String color;
    private String model;

    public Motorbike(int yearOfIssue, String color, String model) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("это мотоцикл");
    }
    public int yearDifference(int year) {
        return Math.abs(year - yearOfIssue);
    }
}
