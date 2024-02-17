package treemapdemo;

import java.util.TreeMap;

public class TreeMapDemo1 {

    public static void main(String[] args) {


        TreeMap<String, Integer> tmap = new TreeMap<>();

        tmap.put("Z", 1 );
        tmap.put("A", 10 );
        tmap.put("X", 9 );
        tmap.put("B", 6 );
        tmap.put("C", 78 );

        System.out.println(tmap);

    }
}
