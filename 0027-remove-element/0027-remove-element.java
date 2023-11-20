class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        int cnt = 0;
        
        for (int n : nums) {
            if (n != val) {
                nums[j] = n;
                cnt++;
                j++;
            }
        }
        return cnt;
    }
}