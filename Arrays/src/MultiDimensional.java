import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    //passisng arrray in reference
//2d array declaring and initializing
// taking inp and printing  its o/p.,
//using to string (),    enhanced for loop


    static void main() {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        //Taking I/p at run time
        for(int row = 0; row < arr.length; row++){
            for (int col = 0 ; col < arr[row].length; col ++){
                arr[row][col] = in.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++ ){

            System.out.println(Arrays.toString(arr[i]));

        }
    }
}
