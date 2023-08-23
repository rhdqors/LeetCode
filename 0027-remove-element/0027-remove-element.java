class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int n : nums) {
            if (n != val) {
                nums[index] = n;
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index;
    }
}