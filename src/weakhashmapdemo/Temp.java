package weakhashmapdemo;

public class Temp {
    @Override
    public String toString() {
        return "Temp";
    }

    //I used this finalize method for garbage collections
    public void finalize(){
        System.out.println("Garbage collection called");
    }
}
