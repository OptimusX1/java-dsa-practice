class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        int i = 0;

        if (n == 1) return true;

        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) return false;
            i++;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {

        // Solution obj = new Solution();

        // int[] arr = {1, 2, 3, 4, 5};
        // int n = arr.length;

        // boolean result = obj.arraySortedOrNot(arr, n);

        System.out.println("Hello world");
    }
}