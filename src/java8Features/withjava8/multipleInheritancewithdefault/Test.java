package java8Features.withjava8.multipleInheritancewithdefault;

public class Test implements Left, Right{
    @Override
    public void m1() {
        Right.super.m1();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();

    }
}
