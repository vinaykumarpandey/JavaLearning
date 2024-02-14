package newComparableDemoList;

import org.jetbrains.annotations.NotNull;

//POJO
public class Employee  implements Comparable<Employee>{

    //If you want to initialise this employee class then you need a constructor
    private int id;
    private String empName;
    private double salary;
    private String department;

    public Employee(int id, String empName, double salary, String department) {
        this.id = id;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
    }

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
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Employee o) {
        Employee employee =  (Employee) o;
        double salary = employee.getSalary();

        if(this.getSalary()>salary )
            return -1;
        else if(this.getSalary() <salary)
            return 1;
        else
            return 0;
    }


    //  Employee{id=1, empName='Jeeva', salary=50000.0, department='Engineering'}
    //  Employee{id=2, empName='Jyothi', salary=55000.0, department='Engineering'}
    //  Employee{id=3, empName='Alex', salary=40000.0, department='Engineering'}
    //  Employee{id=4, empName='Shwetha', salary=15000.0, department='HR'}
    //  Employee{id=5, empName='Xin', salary=50000.0, department='Engineering'}
    //  Employee{id=6, empName='Brigio', salary=50000.0, department='Engineering'}

/*    { 50000, 55000, 40000, 15000, 50000 }
       this,  passed, passed*/

    //


    // compareTo method returns -ve when obj1 has to come before obj2
    //compareTo method returns +ve when obj1 has to come after obj2
    //compareTo method returns 0 when obj1 and obj2 are equal

    //   when obj1 is less than obj2 then compareTo method return -1   (Negative value)
    //   when obj1 is greater then obj2 then compareTo method return 1 (positive value)
}


//Comparable interface -> default sorting order (natural sorting order)
// If you are not satisfied with default or natural sorting order and you want some
// customized sorting them you will move to Comparator
// if you add duplicate objects it will take only one object.

