class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int i = nums.length - 1;
        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(rightSquare > leftSquare){
                sorted[i] = rightSquare;
                right--;
            }
            else{
                sorted[i] = leftSquare;
                left++;
            }
            i--;
        }
        return sorted;  
    }
}