package java8Features.withjava8.staticmethod;

@FunctionalInterface
public interface Interf {

    public void methodOne();

    default void m1(){
        System.out.println("Default m1 method");
    }

    //static method should also be concrete and can't be abstract
    static void sum(int a, int b){
        System.out.println("The sum of two variable is :" +(a+b));
    }
}
