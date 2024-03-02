package java8Features.withjava8.staticmethod;

public class Demo implements Interf{
    public static void main(String[] args) {

        Interf i = new Demo();
        i.m1();

        Interf.sum(5, 4);

    }

    @Override
    public void methodOne() {
        System.out.println("This is methodOne in Domain class");
    }
}
