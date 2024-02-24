package Threading.extendThreadclass.implementrunnable;

public class ThreadDemo {
    public static void main(String[] args) {


        MyThread thread = new MyThread();
        Thread t = new Thread(thread);
        t.start();


        for(int i =0; i<10; i++){
            System.out.println(i + " " +Thread.currentThread().getName());
        }

    }
}
