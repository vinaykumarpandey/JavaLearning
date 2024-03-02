package java8Features.withjava8.stramapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//In this 1 - 10 array elements print only even numbers
public class Test {

    public static void main(String[] args) {

        // 1 2 3 4 5 6 7 8 9 10
        // 1 2 3 4 5 6 7 8 9 10


        //list2-  2 4 6 8 10


        List<Integer> list = new ArrayList<>();

        for(int i =0; i< 10 ; i++){
            list.add(i);

        }

        //list.forEach(a -> System.out.println(a%2==0));

        List<Integer> list2 = list.stream().filter(i -> i%2 !=0).collect(Collectors.toList());
        System.out.println(list2);



    }
}
