package stringdemo;

public class StringDemo {

    public static void main(String[] args) {


        String str = "Bangalore";  //str = 1000
        String str1 ="Bangalore";  //str1 = 1000
        str1 = str1+ " "; // its just changing the address of str1 = 2000

        if(str == str1){ // compare address and not value
            System.out.println("Both are equal");
        } else {
            System.out.println("Not equal");
        }

        if(str.equals(str1)){ //compare value and not address
            System.out.println("equals");
        }else {
            System.out.println("not equals");
        }




    }

}
