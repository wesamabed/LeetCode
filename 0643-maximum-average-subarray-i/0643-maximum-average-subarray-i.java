class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = Double.NEGATIVE_INFINITY;
        double sum = 0;
        int left = 0;
        int right = 0;
        while(right < nums.length){
            sum += nums[right];
            if(right - left + 1== k){
                avg = Math.max(avg, sum / k);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return avg;
    }
}