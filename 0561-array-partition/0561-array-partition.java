class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        
        for(int i=1; i<=nums.length; i++) {
            int min = Math.min(nums[i-1], nums[i]);
            result += min;

            i++;
        }
        
        return result;
    }
}