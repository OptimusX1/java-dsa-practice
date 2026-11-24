import java.util.Arrays;

public class ReverseArray {
    static void main() {
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
    }

    static void reverseArray(int[] arr) {

        int start = 0, end = arr.length -1, temp = 0 ;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reverse Array : " + Arrays.toString(arr));
    }
}
