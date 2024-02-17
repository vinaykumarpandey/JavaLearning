package weakhashmapdemo;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws InterruptedException {


        HashMap weakHashMap = new HashMap();
        Temp t = new Temp(); // t has some address from heap memory
        weakHashMap.put(t, "Bangalore");
        System.out.println(weakHashMap);

        t = null; //but now I am pointing this t to null
        System.gc();
        Thread.sleep(2000);
        System.out.println(weakHashMap);



    }
}
