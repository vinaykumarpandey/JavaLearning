package mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo4 {
    public static void main(String[] args) {


        int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Map<Integer, Integer> map = new HashMap<>();

        //you want to store this array value in a map such that array value will work as a key
        //and value will be multiplied by 3


/*        map    k      v
               0      0*3=0
               1      1*3=3
               2      2*3=6
               3      3*3=9
               4      4*3=12*/

        for(int i =0; i<array.length; i++){
          //  int key = array[i];
            //int value = key*3;
            map.put(array[i], array[i]*3);
        }

        for(int i =0; i<array.length; i++){
            //int key = array[i];
            //int value = map.get(array[i]); ///This will give me the value at that key
            System.out.println(array[i] + " : " +map.get(array[i]));
        }

/*        for(int i =0; i< array.length; i++){
            int key = array[i];
            int value = map.get(key);
            System.out.println(key  + " : " +value);
        }*/



    }
}
