import java.util.Arrays;

public class MaxItem {
    static void main() {
        // Maxium Item and max num i the range (work on edge cases )
        int[]  arr = {1,2,4,4,323,232,222};

        max(arr);
        max(arr, 0, 2);
    }

    static void max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum number : " + max);
    }

    static  void max(int[] arr,int a,int b){
        int max = arr[a];
        for(int i = a+1; i <= b; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Maximum number : " + max);
    }

}
