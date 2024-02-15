package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        //Not a generic hashmap
        //so you can add heterogenous objects here
        //you can add objects in key-value format
        Map map = new HashMap();

        //As soon as you declare a generic HashMap then it will complain if you add heterogenous data

       // Map<String, String> map = new HashMap();

        map.put("8920970051", "Vinay Pandey");
        map.put("1234567890", "Jyothi");
        map.put("6789054321", "Jeeva");
        map.put(3.456, "ABC");
        map.put(2, "Bangalore");

        //4 ways to iterate
        //1. using iterator   -- > covered
        //2. using Map.Entry set ---> covered
        //3. Using object directly - java 8 - simple
        //4. if your key is stored in an array or arraylist then iterate over the array and get the key value pair

        //Using Iterator

        Iterator itr = map.entrySet().iterator();

        while(itr.hasNext()){

            //Map.Entry will give you key-value pair and not just keys
            Map.Entry entry = (Map.Entry) itr.next();
            Object key = entry.getKey();
            Object value = entry.getValue();

            System.out.println(key + " " +value);
        }




    }


}
