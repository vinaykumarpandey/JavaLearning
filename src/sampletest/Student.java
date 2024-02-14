package sampletest;

import employeedemocomparable.Employee;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Student implements Comparator<Student> {

    private int id;
    private String empName;
    private double salary;
    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public Student(int id, String empName, double salary, String department) {
        this.id = id;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

    public Student() {
    }

    /*    @Override
        public int compareTo(@NotNull Object o) {
            Student student =  (Student) o;
            double salary = student.getId();

            if(this.getSalary()>salary )
                return 1;
            else if(this.getSalary() <salary)
                return -1;
            else {
               return this.getEmpName().compareTo(student.getEmpName());
            }


        }*/
@Override
public int compare(Student student1, Student student2) {
    if (student1.getSalary() > student2.getSalary())
        return 1;
    else if (student1.getSalary() < student2.getSalary())
        return -1;
    else {
        return -student1.getEmpName().compareTo(student2.getEmpName());
    }
}
}
