package mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();

        map.put("8920970051", "Vinay Pandey");
        map.put("1234567890", "Jyothi");
        map.put("6789054321", "Jeeva");


        //way2 Map.Entry using for each loop
        for(Map.Entry entry: map.entrySet()){
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key + " " + value);
        }



    }
}
