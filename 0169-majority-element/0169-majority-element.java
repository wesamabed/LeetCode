class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        int curr = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0) curr = nums[i];
            if(nums[i] == curr) count++;
            else{
                count--;
            }
        }
        return curr;
    }
}