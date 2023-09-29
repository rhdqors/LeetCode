class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String result = "";
        String[] arr = paragraph.toLowerCase().split("\\W+");
        
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        
        for(int i=0; i<arr.length; i++) {            
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int cnt = map.get(arr[i]);
                map.put(arr[i], cnt + 1);    
            }
        }
        
        HashSet<String> set = new HashSet<>(Arrays.asList(banned));
        int maxCnt = 0;
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(!set.contains(entry.getKey()) && entry.getValue() > maxCnt) {
                result = entry.getKey();
                maxCnt = entry.getValue();
            }
        }
        
        return result;
    }
}