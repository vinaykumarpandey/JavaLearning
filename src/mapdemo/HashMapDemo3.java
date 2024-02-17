package mapdemo;

import java.util.*;

public class HashMapDemo3 {

    public static void main(String[] args) {


        Map<String, String> map = new LinkedHashMap();

        //java 8 provides streams and internal foreach loop
        //HashMap -> implements map interface
        //LinkedHashMap -> implements map interface

        map.put("8920970051", "Vinay Pandey");
        map.put("1234567890", "Jyothi");
        map.put("6789054321", "Jeeva");

        map.forEach((k, v) -> System.out.println(k + " " + v));


    }
}
