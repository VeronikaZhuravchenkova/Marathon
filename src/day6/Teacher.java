package day6;

public class Teacher {
    private String nameTeacher;
    private String subject;

    public Teacher(String name, String subject) {
        this.nameTeacher = name;
        this.subject = subject;
    }

    public String getName() {
        return nameTeacher;
    }


    public void setName(String name) {
        this.nameTeacher = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate (Student s) {
        int randomMark = (int) (Math.random() * 4) + 2;
        String mark = "";
        if (randomMark == 5) {
             mark = "отлично";
        } else if (randomMark == 4) {
             mark = "хорошо";
        } else if(randomMark == 3) {
             mark = "удовлетворительно";
        } else if (randomMark == 2) {
             mark = "неудовлетворительно";
        }
        System.out.println("Преподаватель " + nameTeacher + " оценил работу студента " + s.getName() +
                " по предмету " + subject + " на оценку " + mark);
    }
}
