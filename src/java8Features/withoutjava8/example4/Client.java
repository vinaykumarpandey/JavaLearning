package java8Features.withoutjava8.example4;

public class Client implements SquareInterface{
    @Override
    public int square(int a) {
         return a*a;
    }

    public static void main(String[] args) {


        Client client = new Client();
  ;     System.out.println("The square of given val is: "+client.square(5));

    }

}
