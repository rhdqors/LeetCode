class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        System.out.println("nums = " + Arrays.toString(nums));
        
        
        for(int i=1; i<=nums.length; i++) {
            // int min = Integer.MAX_VALUE;
            System.out.println("nums[i-1] = " + nums[i-1]);
            System.out.println("nums[i] = " + nums[i]);
            
            int min = Math.min(nums[i-1], nums[i]);
            System.out.println("min = " + min);
            result += min;
            System.out.println("result = " + result);

            i++;
        }
        
        return result;
    }
}