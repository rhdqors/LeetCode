class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> lists = new ArrayList<>();
        int cnt = 0;
        
        for (int n : nums) {
            if (!set.contains(n)) {
                set.add(n);
                lists.add(n);
                cnt++;
            }
        }
        
        for (int i=0; i<lists.size(); i++) {
            nums[i] = lists.get(i);
        }
        
        return cnt;
    }
}