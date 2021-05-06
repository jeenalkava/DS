class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        
      Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
      List<int[]> result=new ArrayList();
        int current[]=intervals[0];
        for(int interval[]:intervals)
        {
            int current_start=current[0];
            int current_end=current[1];
            int next_start=interval[0];
            int next_end=interval[1];
            
            if(current_end>=next_start)
            {
                current[1]=Math.max(current_end,next_end);
                
            }
            else
            {
                current=interval;
                result.add(current);
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
}

Time : log(n)+n
space :o(n)
  
