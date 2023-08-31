class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   return new int[] {i, j};
                }
            }
        }
        return new int[0];
        
        
        
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int[] arr = new int[2];
        
//         for(int i=0; i<nums.length; i++) {
//             int minus = target - nums[i];
//             if(map.containsKey(minus)) {
//                 arr[0] = map.get(minus);
//                 arr[1] = i;
//                 return arr;
//             }
//             map.put(nums[i], i);
//         }
        
//         return arr;
    }
}