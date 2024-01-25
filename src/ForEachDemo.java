import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();

        //[5, 6, 7, 8, 9 ,10]

        //int - primitive data type
        //Integer - wrapper class

        list.add("Jeeva");
        list.add("Jyothi");
        list.add("Bangalore");
        list.add("Hyderabad");





  /*      for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }*/


        //concept of for each loop
     /*   for(Type of each element with a variable name: object name of the collection){
          you can print the variable name
        }*/

        for (String obj: list ) {
            System.out.println(obj);
        }





    }
}
