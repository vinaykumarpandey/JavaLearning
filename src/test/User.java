package test;

import org.jetbrains.annotations.NotNull;

public class User implements Comparable<User>{

   private int id;
   private String name;
   private double salary;

    public User(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // we are going to compare two users based on id's
    // we want to sort based on the salary
    @Override
    public int compareTo(@NotNull User user) {

        if(this.id <user.getId())
            return -1;
        else if(this.id> user.getId())
            return 1;
        else  return -this.name.compareTo(user.getName());


    }
/*    obj1   obj2
    4      5            6
    5       4 */
}
