class Solution {
    public int longestConsecutive(int[] nums) {
         Set<Integer> set=new HashSet<>();
         int longestSeq=0;
        for(int n:nums)
            set.add(n);
        
        for(int n: nums)
        {
            if(!set.contains(n-1))
            {
                int currNum=n;
                int currSeq=1;
            
                while(set.contains(currNum+1))
                {
                    currNum++;
                    currSeq++;
                }
            
            longestSeq=Math.max(currSeq,longestSeq);
        }
    }
        return longestSeq;
    }
}
