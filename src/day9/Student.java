package day9;

public class Student extends Human{
    private String group;

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
     public void printInfo() {
         super.printInfo();
         System.out.println("этот студент с именем " + name);
     }
}
