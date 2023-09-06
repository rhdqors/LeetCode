class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        System.out.println(left + ", " + right);
        
        if(nums.length == 1) {
            return 0;
        }
        
        while(left <= right) {
            // int mid = (left+right)/2;
            int mid = left + (right - left) / 2;
            int target = nums[mid];
            
            if(mid == 0 && nums[mid] > nums[mid+1]) { // peak가 첫 요소
                return mid;
            }
            if(mid == nums.length-1 && nums[mid] > nums[mid-1]) { // peak가 끝 요소
                return mid;
            }
            if( mid > 0 && mid < nums.length - 1 && target > nums[mid-1] && target > nums[mid+1]) {
                System.out.println(" 1 = " + left + ", " + right + ", " + mid);
                System.out.println("target = " + target);
                return mid;
            } else if(mid > 0 && target < nums[mid-1]) { // mid가 0보다 클 때
                System.out.println(" 2 = " + left + ", " + right + ", " + mid);
                right = mid - 1;
            } else { // mid가 0보다 작을 때
                System.out.println(" 3 = " + left + ", " + right + ", " + mid);
                left = mid + 1;
            }
        }
        
        return left;
    }
}