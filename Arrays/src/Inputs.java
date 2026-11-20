import java.util.Arrays;
import java.util.Scanner;

public class Inputs {

    static void main() {
        Scanner in = new Scanner(System.in);

        //array of primitives
//        int[] arr1 = new int[5];
//
//        for(int i = 0 ; i < arr1.length; i++){
//            arr1[i] = in.nextInt();
//        }
//        for (int j : arr1) { //for each element in the array arr1
//            System.out.print(j + " ");
//        }


        //array of objects
//        String[] arr2 = new String[5];
//
//        for(int i = 0 ; i < arr2.length; i++){
//            arr2[i] = in.next();
//        }
//        for (String j : arr2) { //for each element in the array arr1
//            System.out.print(j + " ");
//        }

        //Passing Array as a Reference :
        //calling and printing Array
        //taking the Input 5 times


        int [] arr3 = new int[5];

        for(int i =0 ; i < arr3.length; i ++){
            arr3[i]  = in.nextInt();
        }
        print1(arr3);

    }


    static void print1(int[] arr3){

        System.out.println(Arrays.toString(arr3));
    }
}

