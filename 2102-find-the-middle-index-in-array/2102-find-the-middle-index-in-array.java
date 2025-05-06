class Solution {
    public int findMiddleIndex(int[] nums) {
        int length = nums.length;
        for (int i = 0 ; i < length ; i ++) {
            int prev = 0 , after = 0;
            for (int j = 0 ; j < i ; j++) {
                prev += nums[j];
            }
            for (int k = i + 1 ; k < length ; k++) {
                after += nums[k];
            }
            if (after == prev) return i;
        }
        return -1;
    }
}