package stringdemo;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {

   public static List<Integer> integerList = new ArrayList<>(); //global variable

    public StringDemo( List<Integer> integerList) {
        this.integerList = integerList;
    }

    public static void main() {

        integerList.add(90);

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

  public void  add(){
         integerList.add(19);
    }

    public void  multiple(){
        integerList.add(integerList.get(0)*2);

    }



}
