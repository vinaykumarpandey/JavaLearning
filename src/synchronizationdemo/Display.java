package synchronizationdemo;

public class Display {

    public void wish(String name) throws InterruptedException {

        synchronized (this) { //object level lock
            for (int i = 0; i < 10; i++) {
                System.out.print("Good Morning : ");
                Thread.sleep(1000);
                System.out.println(name);
            }
        }
    }

    public  synchronized static void  message(){ ///If threadA is executing this method - > it already aquired the class level lock
                                                //so no other thread can execute the printMessage() until this threadA gets completed
        System.out.println("some message");     //but threadB can execute wish() parallely as threadB will acquire object level lock
    }

    public  synchronized static void  printMessage(){
        System.out.println("some message");
    }
}

//two types of locks

//1. object level lock
//2. class level lock
