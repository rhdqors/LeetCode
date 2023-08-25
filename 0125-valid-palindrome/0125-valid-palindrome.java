class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = "";
        
        
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        if (!reverse.equals(s)) {
            return false;
        }
        
//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }
            
//             left++;
//             right--;
//         }
        
        return true;
    }
}