public class duplicate {
    public int k;
    public int[] nums;

    public duplicate(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1 ; i < nums.length ; i++)
        {

           if (nums[i] != nums[i-1])
           {
            nums[k] = nums[i];
            k++;
           }
        }
            return k;
    }

}