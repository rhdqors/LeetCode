class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        System.out.println("1 minLength = " + minLength);
        
        for (int right=0; right<nums.length; right++) {
            sum += nums[right];
            System.out.println("1 sum = " + sum);
            System.out.println("right = " + right);
            
            while (sum >= target) {
                minLength = Math.min(minLength, right-left+1);
                System.out.println("2 minLength = " + minLength);
                sum -= nums[left];
                System.out.println("2 sum = " + sum);
                System.out.println("1 left = " + left);
                left++;
                System.out.println("2 left = " + left);
            }
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}