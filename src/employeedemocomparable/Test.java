package employeedemocomparable;

public class Test {

    public static void main(String[] args) {

        // B       A
        //obj1    obj2

      //   when obj1 is less than obj2 then compareTo method return -1   (Negative value)
      //   when obj1 is greater then obj2 then compareTo method return 1 (positive value)

        //IF YOU WANT TO SORT THIS A AND B THEN OUTPUT SHOULD BE [A B]

        System.out.println("A".compareTo("B"));
        System.out.println("B".compareTo("A"));
        System.out.println("J".compareTo("Q"));
        System.out.println("X".compareTo("A"));
        System.out.println("M".compareTo("E"));
        System.out.println("A".compareTo("A"));


        // J       Q   --->
        //obj1     obj2  --->  -1

        // X       A   ---> 1

        // M       E     --->





    }
}
