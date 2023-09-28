class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        int j = 0;
        
        for(int i=s.length-1; i>=0; i--) {
            stack.add(s[i]);
            // s[j] = stack.get(j); 
            // j++;
        }
        System.out.println("Stack = " + stack);
        
        for(int i=0; i<stack.size(); i++) {
            s[i] = stack.get(i);
        }
    }
}