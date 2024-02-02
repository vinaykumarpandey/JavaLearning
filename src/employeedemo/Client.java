package employeedemo;

import java.util.TreeSet;

public class Client {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Jeeva", 50000.00, "Engineering");
        Employee emp2 = new Employee(2, "Jyothi", 55000.00, "Engineering");
        Employee emp3 = new Employee(3, "Alex", 40000.00, "Engineering");
        Employee emp4 = new Employee(4, "Shwetha", 15000.00, "HR");

        System.out.println(emp1 + " " +emp2 + " " +emp3 + " " +emp4);

        TreeSet<Employee> employeeTreeSet = new TreeSet<>();

        employeeTreeSet.add(emp1);
        employeeTreeSet.add(emp2);
        employeeTreeSet.add(emp3);
        employeeTreeSet.add(emp4);

        System.out.println(employeeTreeSet);
    }

}
