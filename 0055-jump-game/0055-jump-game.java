class Solution {
    public boolean canJump(int[] nums) {
        int cnt = 0;
        
        for (int i=0; i<nums.length; i++) {
            if (i > cnt) return false;
            cnt = Math.max(cnt, i + nums[i]);
            System.out.println("cnt = " + cnt);
        }
        
        return true;
    }
}