class Solution {
    public void reverse(int[] arr, int n) {
   
        int temp = 0;
         
        for(int i = 0 ; i < n/2 ; i++){
            temp = arr[i];  //1
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp; 
     
        }

    }
}

 //write a caller 
 class Main {
     public static void main(String[] args) {
         Solution solution = new Solution();
         int[] arr = {1, 2, 3, 4, 5, 6};
         int n = arr.length;
         solution.reverse(arr, n);
         for (int i : arr) {
             System.out.print(i + " ");
         }
     }
 }

// [1,2,3,4,5,6] 6 
