package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student s1 = new Student("Vasilyi", "k1");
        Teacher t1 = new Teacher("Ivan", "Physics");

        System.out.println(s1.getGroupName());
        System.out.println(t1.getSubjectName());

        s1.printInfo();
        t1.printInfo();

    }
}

abstract class Human {
    private String name;
    Human(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo(){
        System.out.printf("Этот человек с именем %s\n", name);
    }
}

class Student extends Human{
    private String groupName;

    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void printInfo(){
        super.printInfo();
        System.out.printf("Этот студент с именем %s\n", super.getName());
    }
}
class Teacher extends Human{
    private String subjectName;
    public Teacher(String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.printf("Этот преподаватель с именем %s\n", super.getName());
    }
}
