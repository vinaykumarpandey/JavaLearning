package java8Features.withoutjava8.example6;


// If I am passing a value 100 and I want to check if the value is greater than 10 or not
public class Domain {
    public static void main(String[] args) {

        System.out.println("Check if value is greater than 10 " + checkVal(8));


    }

    private static boolean checkVal(int i) {

        if(i > 10) return true;
        else return false;
    }
}
