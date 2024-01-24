package equalityTest;

public class Moof {
    int val;

    //default constructor
    public Moof(){

    }

    //Parameterized Constructor
    public Moof(int val) {
        this.val = val;
    }

    public boolean equals(Object o){
        Moof t2 = null;

        //instanceof operator

        if(o instanceof Moof) {
            t2 = (Moof) o;
        } else {
            System.out.println("The object passed is not of Moof type");
            return false;
        }

        if(this.val == t2.val) {
            return true;
        }
        else {
            return false;
        }

    }
}
