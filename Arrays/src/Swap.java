import java.util.ArrayList;
import java.util.Arrays;

public class Swap {

    //swapping by indexes
    static void main() {
        int[] arr1 = {1,2,3,4,5};

        swap(arr1, 0, 1 );

    }

    static  void swap (int[] arr, int a , int b){
        int temp = 0;

        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println(Arrays.toString(arr));

    }
}
