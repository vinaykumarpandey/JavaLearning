package customtreedemo;

import java.util.TreeMap;

public class CustomTreeMapDemo {
    public static void main(String[] args) {


        TreeMap<Employee, Integer> tmap = new TreeMap(new Employee());

        Employee e1 = new Employee(78, "A", 55.00);
        Employee e2 = new Employee(56, "N", 33.00);
        Employee e3 = new Employee(12, "C", 11.00);
        Employee e4 = new Employee(22, "T", 100.00);

        tmap.put(e1, 3);
        tmap.put(e4, 5);
        tmap.put(e3, 10);
        tmap.put(e2, 11);

        System.out.println(tmap);







    }
}
