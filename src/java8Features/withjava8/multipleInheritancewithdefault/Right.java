package java8Features.withjava8.multipleInheritancewithdefault;

public interface Right {
    default void m1(){
        System.out.println("Right Default method");
    }
}
