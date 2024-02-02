package employeedemo;


import org.jetbrains.annotations.NotNull;

//POJO
public class Employee implements Comparable{

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
    public int compareTo(@NotNull Object o) {

        Employee employee =  (Employee) o;
        double salary = employee.getSalary();

        if(this.getSalary()>salary )
            return 1;
        else if(this.getSalary() <salary)
            return -1;
        else
            return 0;


    }

    // compareTo method returns -ve when obj1 has to come before obj2
    //compareTo method returns +ve when obj1 has to come after obj2
    //compareTo method returns 0 when obj1 and obj2 are equal

    //   when obj1 is less than obj2 then compareTo method return -1   (Negative value)
    //   when obj1 is greater then obj2 then compareTo method return 1 (positive value)
}
