package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Наталья", "Литература");
        Student student = new Student("Вероника");

        teacher.evaluate(student);
    }
}
