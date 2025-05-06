class Solution {
    public int findMiddleIndex(int[] nums) {
        int length = nums.length;
        int total = 0, left = 0;
        for (int i = 0 ; i < length ; i ++) {
            total += nums[i];
        }
        for (int j = 0 ; j < length ; j ++) {
            if (left == total - left - nums[j]) return j;
            left += nums[j];
        }
        return -1;
    }
}