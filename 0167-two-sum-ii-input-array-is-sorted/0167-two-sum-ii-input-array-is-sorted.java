class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] result = new int[2];
        
        if (numbers[left] + numbers[right] == target) {
            result[0] = left+1;
            result[1] = right+1;
        }  
        
        while (left < right) {
            // if (numbers[left] + numbers[right] > target) {
            //     right--;
            // } else {
            //     left++;
            // }
            
            if (numbers[left] + numbers[right] == target) {
                if (left == right) {
                    result[0] = left;
                    result[1] = right+2;
                    break;
                }
                result[0] = left+1;
                result[1] = right+1;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        
        return result;
    }
}