class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        int[] answer = new int[nums.length];
        int rightToLeft = 1;
        answer[0] = 1;
        for(int i = 1; i < nums.length; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }
        for(int i = nums.length - 1; i >= 0; i--){
            answer[i] = answer[i] * rightToLeft;
            rightToLeft *= nums[i];
        }
        return answer;
    }
}