package setinterfaceDemo;

//Treeset implements SortedSet & NavigableSet


import java.util.TreeSet;

// We use TreeSet when we need sorted and unique data

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet(); // It has a null
        System.out.println(treeSet);

        Integer i;
        String str;

        treeSet.add(100);
        treeSet.add(70);
        treeSet.add(50);// Integer
        treeSet.add(40);
        treeSet.add(40);
       // treeSet.add("A");
       // treeSet.add(null); // its a second null - throws the NullPointerException


        System.out.println(treeSet);
        System.out.println(treeSet.size());

    }
}
