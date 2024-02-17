package mapanotherdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {


        int array[] = {0, 1, 2, 3, 4,5, 6, 7, 8, 9, 0};
        //value should be multiple of 3

        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i< array.length; i++){
            if(!map.containsKey(array[i])){
                map.put(array[i], array[i]*3);
            }
        }

        for(int i =0; i< array.length; i++){
            System.out.println("Key: " + array[i] + " value: " + map.get(array[i]));
        }



    }
}
