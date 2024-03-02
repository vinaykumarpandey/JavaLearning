package java8Features.withjava8.stramapi;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Bangalore");
        map.put(2, "Mumbai");
        map.put(3, "Delhi");
        map.put(4, "Gurgaon");

        map.forEach((k, v) -> System.out.println(k + " " +v));

    }





}
