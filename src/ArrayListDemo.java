import java.util.ArrayList;

public class ArrayListDemo {


    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        System.out.println(list.size());

        list.add(1); //Integer
        list.add("A"); //String
        list.add(2); //Integer
        list.add(null); //Object
        System.out.println(list);

        //[1, A, 2, null] ...
        list.remove(3);
        System.out.println(list);
        list.add(2, "B");
        System.out.println(list);


    }
}
