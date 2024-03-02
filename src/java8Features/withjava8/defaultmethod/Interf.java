package java8Features.withjava8.defaultmethod;

@FunctionalInterface
public interface Interf {

    public void methodOne(); //abstract method //just declared method -> implementation is pending

    //you can define concrete method as default method

    default void m1(){ // concrete method -> complete method -> method with its implementation code
        System.out.println("this is default method m1");
    }

    default void m2(){ // concrete method -> complete method -> method with its implementation code
        System.out.println("this is default method m2");
    }

}
