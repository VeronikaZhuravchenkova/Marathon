package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void info() {
        System.out.println("Изготавитель: " + producer + ", год выпуска: " + year + ", длина: " + length +
                ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public void fillup(int liter) {
      fuel = fuel + liter;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "producer='" + producer + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", weight=" + weight +
                ", fuel=" + fuel +
                '}';
    }

    public static void compareAirplanes(Airplane a1, Airplane a2) {
        if (a1.getLength() > a2.getLength()) {
            System.out.println("самолет " + a1 + " длиннее самолета " + a2);
        }else if (a2.getLength() > a1.getLength()) {
            System.out.println("самолет " + a2 + " длиннее самолета " + a1);
        }else {
            System.out.println("самолеты одинаковой длины");
        }
    }
}
