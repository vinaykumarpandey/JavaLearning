package mapdemo123;

import java.util.*;

public class HMDemo {
    public static void main(String[] args) {

        List list = new ArrayList<>();

       list.add("Vinay");
        list.add("Ankit");
        list.add("Mishra"); list.add("Anish");
        list.add(1);
        list.add(2.34567890);
 



     list.forEach(a -> System.out.println(a));


/*
        Map<Integer, String> map
                 = new HashMap<>();

       int array[] = {1, 2, 3};

        map.put(array[0], "Ankit");
        map.put(array[1], "Vinay");
        map.put(array[2], "Mishra");

        map.forEach((a, b) -> System.out.println(a + " :: "+b ));*/


    }
}
