package java8Features.withjava8.example4;

public class Client {
    public static void main(String[] args) {

        SquareInterface squareInterface =  a ->  a*a;
        System.out.println("The square of val in java 8 way is " +squareInterface.square(5));

    }
}
