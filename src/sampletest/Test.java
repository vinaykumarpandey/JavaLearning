package sampletest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        Student std1 = new Student(1, "Jeeva", 50000.00, "Engineering");
        Student std2 = new Student(2, "Jyothi", 55000.00, "Engineering");
        Student std3 = new Student(3, "Alex", 40000.00, "Engineering");
        Student std4 = new Student(4, "Shwetha", 15000.00, "HR");
        Student std5 = new Student(5, "Xin", 50000.00, "Engineering");
        Student std6 = new Student(6, "Brigio", 50000.00, "Engineering");

        List<Student> students = new ArrayList<>();

        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
        students.add(std5);
        students.add(std6);

        Collections.sort(students, new Student());

        for (Student st: students
             ) {
            System.out.println(st);
        }



    }
}
