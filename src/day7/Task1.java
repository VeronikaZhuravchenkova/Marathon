package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Veronika", 2000, 5,6000);
        Airplane airplane2 = new Airplane("Kate", 2023,5,7000);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
