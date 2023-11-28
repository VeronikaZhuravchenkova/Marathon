package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Veronika", "11");
        Teacher teacher = new Teacher("Kate", "Math");

        student.printInfo();
        teacher.printInfo();
    }
}
