class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums == null || nums.length < 3) return list;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while(right > left){
                int sum = nums[i] + nums[left] + nums[right];
                if(right > left && sum == 0){
                    list.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    right--;
                    left++;
                    while(right > left && nums[right] == nums[right + 1]) right--;
                    while(right > left && nums[left] == nums[left - 1]) left++;
                }
                else if(right > left && sum > 0) right--;
                else{
                    left++;
                }
            }
        }
        return list;
    }
}