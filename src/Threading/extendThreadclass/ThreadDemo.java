package Threading.extendThreadclass;

import Threading.extendThreadclass.MyThread;

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread t = new MyThread(); //Instantiating a Thread
        t.start();//Starting a thread - child thread
       // t.run(); //difference between t.start() and t.run()
       t.run(5);

        for(int i =0; i<10; i++){
            System.out.println("main thread" + " "+Thread.currentThread().getName());  //main thread
        }

    }
}
