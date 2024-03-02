package java8Features.withjava8.innerclass;

public class Outer {

    void methodTwo(){
        System.out.println("Print outer class : method two");
    }

    class Inner{
        void methodOne(){
            System.out.println("Inside Inner class :  method One");
        }
    }
}
