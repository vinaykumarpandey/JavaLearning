package java8Features.withoutjava8.example3;

public class Client implements SumInterface{

    @Override
    public void sum(int a, int b) {
        System.out.println("The sum of a and b is: " +(a+b));
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.sum(5, 4);


    }
}
