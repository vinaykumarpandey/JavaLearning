package Threading.extendThreadclass.yielddemo;


public class ThreadYieldDemo {

    public static void main(String[] args) {


        MyThread t = new MyThread(); //thread priority 5
        t.start();

        //main thread also have the thread priority 5

        for (int i =0; i<10; i++){
            Thread.yield();
            System.out.println("main thread");
        }
    }
}
