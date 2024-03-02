package java8Features.withjava8.example5;

public class ThreadDemo {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            for(int i =0; i< 5; i++){
                System.out.println("child thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        for(int i =0; i< 5; i++){
            System.out.println("main thread");
        }


    }
}
