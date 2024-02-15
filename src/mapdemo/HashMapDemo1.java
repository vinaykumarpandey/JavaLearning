package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo1 {

    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();

        map.put("8920970051", "Vinay Pandey");
        map.put("1234567890", "Jyothi");
        map.put("6789054321", "Jeeva");

        //Iterate over it

        Iterator itr = map.keySet().iterator();

        //key set will give you all the keys
        //from key you need to get the value

        while(itr.hasNext()){
            String key = (String) itr.next();
            String value = map.get(key);

            System.out.println(key + " " +value);
        }

    }
}
