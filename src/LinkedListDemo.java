import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add("Jeeva");
        ll.add(1);
        ll.add(3);
        ll.add("something");

        System.out.println(ll);

        ll.addFirst("Jyothi");
        ll.addLast("more values");
        System.out.println(ll);

        ll.remove(3);
        System.out.println(ll);

        System.out.println("check if jeeva is present " + ll.contains("Vinay"));
        ll.removeLast();
        System.out.println(ll);

    }

}
