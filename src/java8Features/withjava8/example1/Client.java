package java8Features.withjava8.example1;

import java.util.Comparator;
import java.util.concurrent.Callable;

public class Client  {

   // Lambda expression is just an anonymous (nameless) function.
    //that means the function which doesn't have name, return type and access modifiers

    public void m1(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        Client client = new Client();
        Runnable runnable = () -> client.m1();


        runnable.run();


    }

}
