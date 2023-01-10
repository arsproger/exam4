package Task5;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("Bob", 4));
        treeSet.add(new Student("Nancy", 10));
        treeSet.add(new Student("John", 3));
        treeSet.add(new Student("Arsen", 7));
        treeSet.add(new Student("Steven", 9));

        for(Student student: treeSet) {
            System.out.println(student);
        }
    }
}
