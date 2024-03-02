package java8Features.withoutjava8.example5;

public class ThreadDemo {
    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);

        thread.start();

        for(int i =0; i<5; i++){
            System.out.println("Main Thread");
        }


    }
}
