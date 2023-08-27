class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        
        for (int right=0; right<s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                // System.out.println("3set = " + set);
                set.remove(s.charAt(left));
                // System.out.println("4set = " + set);
                // System.out.println("max = " + max);
                left++;
            }
            
            // System.out.println("1set = " + set);
            set.add(s.charAt(right));
            // System.out.println("2set = " + set);
            max = Math.max(max, set.size());
            
            
        }
        // return set.size();
        return max;
    }
}