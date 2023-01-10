package Task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private double avgAllTask;

    public Student(String name, String group, int course, double avgAllTask) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.avgAllTask = avgAllTask;
    }

    public static void checkStudentList(ArrayList<Student> list) {
        for(Student student: list) {
            if(student.getAvgAllTask() < 3) {
                list.remove(student);
            }
            else {
                student.setCourse(student.getCourse() + 1);
            }
        }
        System.out.println(list);
    }

    public static void printStudents(List<Student> students, int course) {
        for(Student student: students) {
            if(student.getCourse() == course) System.out.println(student);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgAllTask() {
        return avgAllTask;
    }

    public void setAvgAllTask(double avgAllTask) {
        this.avgAllTask = avgAllTask;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", avgAllTask=" + avgAllTask +
                '}';
    }
}
