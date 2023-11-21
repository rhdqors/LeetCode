class Solution {
    public void rotate(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        k %= nums.length;
        
        reverse(nums, left, right);
        reverse(nums, left, k-1);
        reverse(nums, k, right);
    }
    
    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    
}