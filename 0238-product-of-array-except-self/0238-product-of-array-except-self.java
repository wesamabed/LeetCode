class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        int[] answer = new int[nums.length];
        int[] leftToRight = new int[nums.length];
        int[] rightToLeft = new int[nums.length];
        leftToRight[0] = 1;
        rightToLeft[nums.length - 1] = 1;
        for(int i = 1; i < nums.length; i++){
            leftToRight[i] = nums[i-1] * leftToRight[i - 1];
        }
        for(int i = nums.length - 2; i >= 0; i--){
            rightToLeft[i] = nums[i+1] * rightToLeft[i+1];
        }
        for(int i = 0; i < nums.length; i++){
            answer[i] = leftToRight[i] * rightToLeft[i];
        }
        return answer;
    }
}