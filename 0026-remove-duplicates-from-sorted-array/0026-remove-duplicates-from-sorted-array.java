class Solution {
    public int removeDuplicates(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        List<Integer> lists = new ArrayList<>();
        
        int cnt = 0;
        int index = 0;
        
        for(int n : nums) {
            if(!lists.contains(n)) {
                // set.add(n);
                lists.add(n);
            }
        }
        
        for(int i=0; i<lists.size(); i++) {
            nums[i] = lists.get(i);
            cnt++;
        }
        
        return cnt;
    }
}