class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        char[] chars = null;
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        
        for(int i=0; i<strs.length; i++) {
            chars = strs[i].toCharArray();
            Arrays.sort(chars);
            System.out.println("chars 1 = " + Arrays.toString(chars)); // chars배열 요소별 정렬 완료
            System.out.println("strs[i] = " + strs[i]);
            String str = new String(chars);
            System.out.println("str = " + str);
            if(!map.containsKey(str)) {
                map.put(str, new ArrayList<String>());
            }
            map.get(str).add(strs[i]);
        }
        System.out.println("map = " + map);
        
        return new ArrayList<>(map.values());
    }
}