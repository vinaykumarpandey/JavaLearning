package newComparableDemoList;

import employeedemocomparable.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Jeeva", 50000.00, "Engineering");
        Employee emp2 = new Employee(2, "Jyothi", 55000.00, "Engineering");
        Employee emp3 = new Employee(3, "Alex", 40000.00, "Engineering");
        Employee emp4 = new Employee(4, "Shwetha", 15000.00, "HR");
        Employee emp5 = new Employee(5, "Xin", 50000.00, "Engineering");
        Employee emp6 = new Employee(6, "Brigio", 50000.00, "Engineering");

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(emp1);
        employeeList.add(emp3);
        employeeList.add(emp6);
        employeeList.add(emp4);
        employeeList.add(emp2);
        employeeList.add(emp5);

         Collections.sort(employeeList);

        for(Employee emp: employeeList){
            System.out.println(emp);
        }
    }
}
