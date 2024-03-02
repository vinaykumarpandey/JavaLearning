package java8Features.withjava8.example2;

public class Demo {
    public static void main(String[] args) {
        Inter i = () -> System.out.println("Method1 execution in java 8 way");
        i.methodOne();
    }
}
