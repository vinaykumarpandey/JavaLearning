package employeedemocomparable;

import java.util.TreeSet;

public class Client {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Jeeva", 50000.00, "Engineering");
        Employee emp2 = new Employee(2, "Jyothi", 55000.00, "Engineering");
        Employee emp3 = new Employee(3, "Alex", 40000.00, "Engineering");
        Employee emp4 = new Employee(4, "Shwetha", 15000.00, "HR");
        Employee emp5 = new Employee(5, "Xin", 50000.00, "Engineering");
        Employee emp6 = new Employee(6, "Brigio", 50000.00, "Engineering");

        System.out.println(emp1 + " " +emp2 + " " +emp3 + " " +emp4 + " " +emp5 +" " +emp6);

        TreeSet<Employee> employeeTreeSet = new TreeSet<>();

        employeeTreeSet.add(emp1);
        employeeTreeSet.add(emp2);
        employeeTreeSet.add(emp3);
        employeeTreeSet.add(emp4);
        employeeTreeSet.add(emp5);
        employeeTreeSet.add(emp6);

        System.out.println(employeeTreeSet);
    }

}
