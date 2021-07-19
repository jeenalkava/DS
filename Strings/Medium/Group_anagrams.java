class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(String s :strs)
        { 
            char temp[]=s.toCharArray();
            Arrays.sort(temp);
            String sorted=new String(temp);
            if(!map.containsKey(sorted))
                map.put(sorted,new ArrayList<>());
            
            map.get(sorted).add(s);
                
        }
        result.addAll(map.values());
        return result;
        
    }
}

Time  : O(nmlog(m))
Space : O(k)
