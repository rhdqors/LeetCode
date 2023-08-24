class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        
        List<Integer> kLists = new ArrayList<>();
        for (int i = n - k; i < n; i++) {
            kLists.add(nums[i]);
        }

        for (int i = n - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = kLists.get(i);
        }
    }
}
