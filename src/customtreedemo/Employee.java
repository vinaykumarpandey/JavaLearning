package customtreedemo;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compare(Employee emp1, Employee emp2) {
        //i am comparing two employee objects based on salary

        double salary1 = emp1.salary;
        double salary2 = emp2.salary;

        if(salary1 < salary2)
             return -1;
        else if(salary1 > salary2)
            return 1;
        return 0;

    }
}
