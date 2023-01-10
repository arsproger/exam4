package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Arsen", "Java", 2, 4.5));
        arrayList.add(new Student("Bob", "Python", 3, 4.2));
        arrayList.add(new Student("Nancy", "Java", 1, 4.8));
        arrayList.add(new Student("Max", "C#", 2, 4.1));
        arrayList.add(new Student("John", "Python", 1, 4.0));


        Student.checkStudentList(arrayList);
        System.out.println();
        Student.printStudents(arrayList, 2);
    }
}
