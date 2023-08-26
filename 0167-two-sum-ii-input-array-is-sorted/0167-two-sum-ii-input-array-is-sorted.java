class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int[] result = new int[2];
        
        System.out.println("0 left = " + left);
        System.out.println("0 right = " + right);
        
        if (numbers[left] + numbers[right] == target) {
            result[0] = left+1;
            result[1] = right+1;
        }  
        
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                System.out.println(numbers[left] + " + " + numbers[right] + " = " + (numbers[left] + numbers[right]));
                right--;
            } else {
                left++;
            }
            
            if (numbers[left] + numbers[right] == target) {
                if (left == right) {
                    result[0] = left;
                    result[1] = right+2;
                    break;
                }
                result[0] = left+1;
                result[1] = right+1;
                System.out.println("1 left = " + left);
                System.out.println("1 right = " + right);
                break;
            }
        }

        
        return result;
    }
}