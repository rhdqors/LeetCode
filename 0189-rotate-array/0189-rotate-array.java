class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int end = nums.length-1;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> kLists = new ArrayList<>();
        
        System.out.println("list = " + list);
        
        for (int i=0; i<k; i++) {
            kLists.add(list.get(end-i));
            list.remove(end-i);
        }
        System.out.println("result1 = " + list);
        System.out.println("result2 = " + kLists);
        
        for (int i=0; i< kLists.size(); i++) {
            list.add(0,kLists.get(i));
        }

        System.out.println("result3 = " + list);
        for (int i=0; i<nums.length; i++) {
            nums[i] = list.get(i);
        }
    }
}