class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int index = 0;
        
        for (int n : nums) {
            if (!arr.contains(n)) {
                // set.add(n);
                arr.add(n);
                index++;
            }
        }

        for (int i=0; i<arr.size(); i++) {
            nums[i] = arr.get(i);
        }

        System.out.println("arr = " + arr);
        return index;
    }
}