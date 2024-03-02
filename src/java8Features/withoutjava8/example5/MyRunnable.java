package java8Features.withoutjava8.example5;

public class MyRunnable implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        for(int i =0; i<5; i++){
            System.out.println("Child Thread");
        }
    }
}
