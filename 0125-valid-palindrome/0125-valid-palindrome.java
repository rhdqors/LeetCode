class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length()-1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}

// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//         StringBuilder reverse = new StringBuilder();

//         for (int i = s.length() - 1; i >= 0; i--) {
//             reverse.append(s.charAt(i));
//         }
//         if (!reverse.toString().equals(s)) {
//             return false;
//         }

//         return true;
//     }
// }