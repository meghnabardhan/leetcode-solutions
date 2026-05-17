class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            List<String> group = new ArrayList<>();
            String s = strs[i];
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(map.containsKey(sorted)){
                map.get(sorted).add(s);
            }
            else{
                group.add(s);
                map.put(sorted,group);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> val:map.values())
            ans.add(val);
        return ans;
    }
}