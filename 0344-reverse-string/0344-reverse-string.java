class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i=s.length-1; i>=0; i--) {
            stack.add(s[i]);
        }
        
        for(int i=0; i<stack.size(); i++) {
            s[i] = stack.get(i);
        }
    }
}