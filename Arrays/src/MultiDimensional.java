import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    //passing array in reference
//2d array declaring and initializing
// taking inp and printing  its o/p.,
//using to string (),    enhanced for loop
    //Dynamic Arrays


    static void main() {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        //Taking I/p at run time
//        for(int row = 0; row < arr.length; row++){
//            for (int col = 0 ; col < arr[row].length; col ++){
//                arr[row][col] = in.nextInt();
//            }
//        }
//
//        for (int[] ints : arr) {
//
//            System.out.println(Arrays.toString(ints));
//
//        }

        //Dynamic Arrays
        int[][] arr2 = { {1,2,3}, {4,5}, {6,7,8,9} };
//        for (int row = 0; row  < arr2.length; row++){
//            for(int col = 0; col < arr2[row].length; col++){
//                System.out.print(arr2[row] [col] + " ");
//            }
//            System.out.println();
//        }

// Enhanced for loop
        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }





    }
}
