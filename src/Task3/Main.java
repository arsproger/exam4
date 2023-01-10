package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Arsen", "Java", 2, 4.5));
        arrayList.add(new Student("Bob", "Python", 3, 2.2));
        arrayList.add(new Student("Nancy", "Java", 1, 3.8));
        arrayList.add(new Student("Max", "C#", 2, 3.1));
        arrayList.add(new Student("John", "Python", 1, 2.7));

        System.out.println("Студенты до изменений:");
        System.out.println(arrayList);
        System.out.println("После проверки:");
        Student.checkStudentList(arrayList);
        System.out.println(arrayList);
        System.out.println();
        Student.printStudents(arrayList, 3);
    }
}
