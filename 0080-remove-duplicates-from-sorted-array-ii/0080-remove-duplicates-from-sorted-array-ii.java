class Solution {
    public int removeDuplicates(int[] nums) {
        
        int index = 2;
        
        for (int i=2; i<nums.length; i++) {
            if (nums[i] != nums[index-2]) {
                System.out.println("nums[i] = " + nums[i]);
                System.out.println("nums[index-2] = " + nums[index-2]);
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println("index = " + index);
        System.out.println("result = " + Arrays.toString(nums));
        return index;
    }
}