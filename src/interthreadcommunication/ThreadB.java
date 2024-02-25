package interthreadcommunication;

public class ThreadB extends Thread{

    int total =0;

    public void run(){

        synchronized (this){

            System.out.println("thread b started the calculation");  //step 2

            for(int i =0; i<=100; i++){
                total = total+i;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("thread b has calculated the total sum and wants to notify the waiting main thread");

            this.notifyAll();


        }

    }

}
