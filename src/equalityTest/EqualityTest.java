package equalityTest;

public class EqualityTest {
    public static void main(String[] args) {

        Moof t1 = new Moof(5); //One object of Moof class
        Moof t2 = new Moof(5); //Second Object of Moof class
        Student t3 = new Student();



        // if t1 is equal to t2 ?

/*        if(t1 == t2){
            System.out.println("Both objects are equals");
        } else {
            System.out.println("Objects are not equals");
        }*/

        //what's I want if I pass same variable in both objects then both objects should be equals


        if(t1.equals(t2)){
            System.out.println("Both objects are equal");
        } else {
            System.out.println("Objects are not equal");
        }

        if(t1.equals(t3)){
            System.out.println("Do something");
        } else {
            System.out.println("Do something else");
        }



    }
}
