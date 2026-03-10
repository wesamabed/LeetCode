class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1;
            int high = nums.length - 1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while(low < high && nums[low] == nums[low+1]) low++;
                    while(low < high && nums[high] == nums[high-1]) high--;
                    low++;
                    high--;
                }
                else if(sum < 0) low++;
                else high--;
            }
        }
        return list;
    }
}