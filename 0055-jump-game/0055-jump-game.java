class Solution {
    public boolean canJump(int[] nums) {
        int maxCnt = 0;
        int length = nums.length;
        
        for (int i=0; i<length; i++) {
            if (i > maxCnt) return false;
            maxCnt = Math.max(maxCnt, i + nums[i]);
        }
        
        return true;
    }
}