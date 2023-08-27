class Solution {
 public int lengthOfLongestSubstring(String s) {

     int max = 0;
     int left = 0;
     HashSet<Character> set = new HashSet<>();

     for (int right=0; right<s.length(); right++) {
         while (set.contains(s.charAt(right))) {
             // System.out.println("1 set = " + set);
             set.remove(s.charAt(left));
             // System.out.println("2 set = " + set);
             left++;
         }
         // System.out.println("3 set = " + set);
         set.add(s.charAt(right));
         // System.out.println("4 set = " + set);
         max = Math.max(max, set.size());
         // System.out.println("max = " + max);
     }

     return max;
 }
}