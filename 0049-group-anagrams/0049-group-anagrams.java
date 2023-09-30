class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        char[] chars = null;
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++) {
            chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            
            if(!map.containsKey(str)) {
                map.put(str, new ArrayList<String>());
            }
            map.get(str).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
    }
}