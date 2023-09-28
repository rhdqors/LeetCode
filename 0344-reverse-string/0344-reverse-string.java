class Solution {
    public void reverseString(char[] s) {
        
//         int left = 0;
//         int right = s.length-1;
        
//         while(left < right) {
//             char temp = s[left];
            
//             s[left] = s[right];
//             s[right] = temp;
                
//             left++;
//             right--;
//         }
        
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=s.length-1; i>=0; i--) {
            stack.add(s[i]);
        }
        
        for(int i=0; i<stack.size(); i++) {
            s[i] = stack.get(i);
        }
    }
}