package mapdemo;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

    public static void main(String[] args) {


        HashMap imap = new HashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);

        imap.put(i1, "ABC");
        imap.put(i2, "DEF");

        System.out.println(imap.size());


    }

}
