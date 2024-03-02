package java8Features.withjava8.example;

@FunctionalInterface
public interface B extends A{
    public void methodOne(); //B is overriding A's method
                             // but still B has only 1 abstract method and A also has only one abstract
    // method
}
