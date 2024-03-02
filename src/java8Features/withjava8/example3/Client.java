package java8Features.withjava8.example3;

public class Client {

    public static void main(String[] args) {

        SumInterface sumInterface = (int a, int b) -> System.out.println("The of a and b in java 8 way is : " +(a+b));
        sumInterface.sum(5, 4);


    }
}
