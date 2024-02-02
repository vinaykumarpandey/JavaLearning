package setinterfaceDemo;

import java.util.TreeSet;

public class TreeSetStringStorage {

    public static void main(String[] args) {



        //Generic TreeSet of type String
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("jeeva"); //storing string object inside treeset
        treeSet.add("alex");
        treeSet.add("shwetha");
        treeSet.add("navin");
        treeSet.add("jyothi");
        treeSet.add("jhinga");

        System.out.println(treeSet);

    }
}
