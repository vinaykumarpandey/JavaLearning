package java8Features.withjava8.innerclass;

public class Test {
    public static void main(String[] args) {


        Outer.Inner object = new Outer().new Inner();
        object.methodOne();

        Outer outer = new Outer();
        outer.methodTwo();


    }
}
