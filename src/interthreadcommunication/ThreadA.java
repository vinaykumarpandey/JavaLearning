package interthreadcommunication;

public class ThreadA {

    public static void main(String[] args) throws InterruptedException {

        //main thread started

        ThreadB b = new ThreadB(); //created a new thread b
        b.start();  //started the new thread b

        //there are two threads running in seperate call stack

        // 1. main thread       ---        2.  b thread

        synchronized (b){
            System.out.println("Main thread calling wait method on thread b");
            b.wait(); // I instructed the main thread to wait on thread b --> I am saying to main thread that wait
                      // unltil thread b gets completed
                      // now main thread has entered into the waiting state
            System.out.println("main thread has been  notified by thread b and now its print the total");
            System.out.println(b.total);
        }


    }
}
