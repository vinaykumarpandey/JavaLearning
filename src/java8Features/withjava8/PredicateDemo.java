package java8Features.withjava8;

import java.util.function.Predicate;

public class PredicateDemo {



    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i>10;

        System.out.println("check if the given value is greater than 10 "    + predicate.test(10) );
        System.out.println("check if the given value is greater than 10 "    + predicate.test(1) );
        System.out.println("check if the given value is greater than 10 "    + predicate.test(100) );

    }



}
