import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        System.out.println(list.size());

        list.add(1);
        System.out.println(list.size());
        list.add("A");
        list.add(2);
        list.add(null);
        System.out.println(list);

        //[1, A, 2, null] ...
        list.remove(3);
        System.out.println(list);
        list.add(2, "B");
        System.out.println(list);


    }
}
