class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        HashSet<String> bannedWords=new HashSet<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(String word: banned)
        {
            bannedWords.add(word);
        }
        for(String word:paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase().split(" "))
        {
            if(!bannedWords.contains(word))
            {
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        String result="";
        for(String key :map.keySet())
        {
            if((result.equals("")) || (map.get(key)>map.get(result)))
               {
                   result=key;
               }
        }
        return result;
        
    }
}

Time :  O(n)
Space : O(n)
