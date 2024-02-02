package setinterfaceDemo;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//To Main the insertion order
// Store unique elements only
public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("A");
        linkedHashSet.add("Z");
        linkedHashSet.add("J");
        linkedHashSet.add("U");
        linkedHashSet.add("X");
        linkedHashSet.add("Y");

        for(String str: linkedHashSet){
            System.out.println(str);
        }


    }
}
