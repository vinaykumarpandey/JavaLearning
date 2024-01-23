import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
/*        int size = 10;
       int arr[] = new int[size];*/

       /* int arr[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };*/


        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0; i< 10; i++){
            list.add(i*2);
        }

   /*     for(int i =0; i< 10 ; i++){
            System.out.println(list.get(i));
        }*/

        System.out.println(list.size());




    }
}