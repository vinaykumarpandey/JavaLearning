package cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {

        Vector v = new Vector();

        for(int i =0; i< 10; i++){
            v.add(i);
        }

        //System.out.println(v);

        Enumeration enumeration = v.elements();

        while(enumeration.hasMoreElements()){

          Integer val = (Integer) enumeration.nextElement();

          if(val %2 == 0){
              System.out.println(" even no " + val);
          } else {
              System.out.println("odd no " +val);
          }

        }

    }

}
