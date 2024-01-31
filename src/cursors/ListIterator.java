package cursors;

import java.util.LinkedList;


public class ListIterator {

    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<>();
        l.add("Veera");
        l.add("Jimy");
        l.add("Alex");
        l.add("Pat");   //if you want to replace Pat with Jeeva
        l.add("Samuel");

        System.out.println(l);

        int length = l.size();

        java.util.ListIterator itr = l.listIterator(length);
         while(itr.hasPrevious()){

             //here I am updating the value from Pat to Jeeva
             String value = (String) itr.previous();
             if(value.equals("Pat")){
                 itr.set("Jeeva");
             }
         }

        System.out.println(l);








    }

}
