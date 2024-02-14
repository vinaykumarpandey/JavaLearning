package demo;


public abstract class Z {
   private int val;
   private double x;
   private float q;

    protected Z(int val, double x, float q) {
        this.val = val;
        this.x = x;
        this.q = q;
        System.out.println("abstract class constructor");
    }



}
