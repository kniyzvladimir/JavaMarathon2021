package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Albert", "physics");
        Student s1 = new Student("Vladimir");
        t1.evaluate(s1);

    }
}

class Teacher{
    private String name;
    private String subject;
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }
    public String ocenka(int bal){
        String result = "";
        switch (bal){
            case 5:
                result = "отлично";
                break;
            case 4:
                result = "хорошо";
                break;
            case 3:
                result = "удовлетворительно";
                break;
            case 2:
                result = "неудовлетворительно";
                break;
        }
        return result;
    }
    public void evaluate(Student student){
        Random random = new Random();
        int bal = random.nextInt(4) + 2;
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.", name, student.name, subject, this.ocenka(bal) );

    }
}

class Student{
    String name;
    public Student(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}