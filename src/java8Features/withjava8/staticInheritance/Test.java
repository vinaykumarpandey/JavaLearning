package java8Features.withjava8.staticInheritance;

public class Test implements Interf{
    public void m1(){
        System.out.println("printing m1 method in class");
    }

    public static void main(String[] args) {

        Interf i = new Test();
        Interf.m1();

    }
}
