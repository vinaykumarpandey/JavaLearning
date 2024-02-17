package treemapdemo;

//primitive data type

/*if you want to store the primitive data type in any collection like
List or Set or Map then there will be a default conversion from primitive to wrapper classes*/
//int   ->   Integer
//long
//double
//float


//wrapper classes

//Integer  -> implemnts Comparable interface - natural sorting order
//Long
//Double
//Float


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

     TreeMap<Float, String> tmap = new TreeMap<>();

         tmap.put(10.90f, "A" );
        tmap.put(11.12f, "B" );
        tmap.put(1.12f, "C" );
        tmap.put(1.13f, "D" );
        tmap.put(8.56f, "E" );

        System.out.println(tmap);






    }
}
