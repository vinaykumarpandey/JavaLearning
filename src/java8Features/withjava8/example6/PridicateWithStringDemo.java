package java8Features.withjava8.example6;

//if I am passing some string it should return true if the length of the string
// is greater than 2 else return false

import java.util.function.Function;
import java.util.function.Predicate;

public class PridicateWithStringDemo {

    public static void main(String[] args) {



        Predicate<String> predicate = str -> str.length()>2;
        System.out.println(predicate.test("Vinay"));
        System.out.println(predicate.test("V"));
        System.out.println(predicate.test("Jeeva"));
        System.out.println(predicate.test("J"));



    }
}
