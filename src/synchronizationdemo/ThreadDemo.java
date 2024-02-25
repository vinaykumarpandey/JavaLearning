package synchronizationdemo;

public class ThreadDemo {

    public static void main(String[] args) {


        Display d = new Display(); //this should be common object
        MyThread t1 = new MyThread(d, "Shahrukh Khan");
        MyThread t2 = new MyThread(d, "Salman khan");

        t1.start();
        t2.start();



    }
}
