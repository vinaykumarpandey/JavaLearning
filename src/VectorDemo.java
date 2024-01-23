import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector vector = new Vector();

        vector.add(1);
        vector.add("B");
        vector.add(1, "A");
        vector.add(2.15);

        System.out.println(vector);

    }
}
