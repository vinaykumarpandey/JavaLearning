import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet setObject = new HashSet();

        setObject.add("A"); //int (primitive data type) - > Integer(object) -> primitive to wrapper conversion
        setObject.add("B"); //String is an object
        setObject.add("C");
        setObject.add("D");
        setObject.add("E");
        setObject.add("F");
        //setObject.add("E");
        setObject.add(1);
        setObject.remove("F");
        setObject.remove(1);
        setObject.add(new Date());
        setObject.add("E");
        setObject.add("E");


        System.out.println(setObject.size());

        if(setObject.contains(1)){
            System.out.println("1 is present ");
        } else {
            System.out.println("1 is not present");
        }


        //A B C D E F  1 DATE  - INSERTION ORDER
        // A 1 B C D E F DATE - RANDOM ORDER
        // No order is gauranteed in set object
        //Iterate the set
        //1. Using Iterator

        //hasNext() -> if there is any next element present inside the set or not
        //next -> this method will provide the access of that element

         Iterator itr = setObject.iterator();

        //this itr object is used to invoke the iterator over the set to iterate over the elements(objects) of set

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        // 2nd way to iterate over set object

        //using foreach loop
/*
        for (Object obj: setObject ) {
            System.out.println(obj);
        }*/

    }

}
