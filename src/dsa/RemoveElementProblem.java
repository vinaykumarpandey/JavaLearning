package dsa;


/*Q4. Copy the Array

        Problem Description
        You are given a constant array A and an integer B.

        You are required to return another array where outArr[i] = A[i] + B.

        Example Input:
        A = [1,2,3,2,1]
        B = 3

        Example Output
        [4,5,6,5,4]*/

public class RemoveElementProblem {

    public static void main(String[] args) {

        // input[] =  1 2 3 2 1
        //output[] =  4 5 6 ...

        int input[] = {1,2,3,2,1};
        int b = 3;

        // 1. Take an output array of same size as input array
        int size = input.length;
        int output[] = new int[size];

        // 2. iterate of the input array and in each element add b and store it in output array
        for(int i =0; i<size; i++){
          output[i] =  input[i] + b;
        }

        // 3. print the output array

        for(int i =0; i< size; i++){
            System.out.println(output[i]);
        }


    }

}
