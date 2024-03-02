package java8Features.withjava8.example6;


import java.util.function.Function;

//given the string print the length of the string
public class FunctionsDemo {

    public static void main(String[] args) {

        Function<String, Integer> function = str -> str.length();

        System.out.println(function.apply("Vinay"));
        System.out.println(function.apply("Jeeva"));
        System.out.println(function.apply("Jyothi"));
        System.out.println(function.apply("Bangalore"));



    }


}
