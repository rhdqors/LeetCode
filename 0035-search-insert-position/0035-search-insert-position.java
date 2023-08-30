class Solution {
    public int searchInsert(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length-1;
        
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
            
//             if (target == nums[mid]) {
//                 return mid;
//             } else if (target > mid) {
//                 left = mid+1;
//             } else {
//                 right = mid-1;
//             }
//         }

//         return left;
        
        
        
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
}