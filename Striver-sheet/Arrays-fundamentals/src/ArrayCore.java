
void main() {

    //Left Rotate an Array by One Position
    int[] nums = {1, 2, 3, 4, 5};
    //Output: [2, 3, 4, 5, 1]

    RotateArray(nums);


}

//brute force approach
static void RotateArray(int[] nums){
    int temp = 0;
    temp = nums[0];
    for (int i = 0; i < nums.length-1; i++){

        nums[i] = nums[i+1];

    } nums[nums.length-1] = temp;

    System.out.println(Arrays.toString(nums));
}


