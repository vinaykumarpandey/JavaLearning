package cursors;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList();

        for(int i =0; i< 10 ; i++){
            arrayList.add(i);
        }

        //System.out.println(arrayList);

        Iterator itr = arrayList.iterator();

        //you are traversing on this arraylist using this iterator itr

        while(itr.hasNext()){

            Integer val = (Integer) itr.next();
            //if the element is even then print the element or eles remove the element from the collection
            if(val % 2 == 0){
                System.out.println(val);
            } else {
                itr.remove();
            }


        }

        System.out.println(arrayList);

    }

}
