package java8Features.withjava8.multipleInheritancewithdefault;

public interface Left {

    default void m1(){
        System.out.println("Left Default method");
    }
}
