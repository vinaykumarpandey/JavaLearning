import java.util.ArrayList;

public class ObjectDemo {

    public static void main(String[] args) {

        //Homogenous or heterogenous objects

        ArrayList list = new ArrayList();

        list.add(1);  //Integer
        list.add("Demo"); //String
        list.add(4.8); // float
        list.add(new Student("Jeeva ", 1));//Object
        list.add(new Student("Jyothi ", 2));

        //name - Jeeva
        //id -1

        for(Object obj: list){
            System.out.println(obj);
        }


    }
}
