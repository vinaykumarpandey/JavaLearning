package java8Features.withjava8.defaultmethod;

public class Test implements Interf{
    @Override
    public void methodOne() {
        System.out.println("printing methodOne: from interf");
    }

    public static void main(String[] args) {
        Interf i = new Test();
        i.methodOne();
        i.m1();
        i.m2();
    }
}
