package Threading.extendThreadclass;

public class MyThread extends Thread{

    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Child Thread " + " " +Thread.currentThread().getName());  //child thread
        }
    }

    public void start(){
        System.out.println("overriding start method" + " " +Thread.currentThread().getName());
    }

    public void run(int i){
        System.out.println("i is :" +i + " " +Thread.currentThread().getName());  //main thread
    }
}
