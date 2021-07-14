class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals==null || intervals.length==0)
            return 0;
        
        Arrays.sort(intervals,(a,b) -> a.start-b.start);
        
        PriorityQueue<Interval> minHeap=new PriorityQueue<>((a,b)->a.end-b.end);
        minHeap.add(intervals[0]);
        for(int i=1;i<intervals.length;i++)
        {
            Interval current=intervals[i];
            Interval earliest=minHeap.remove();
            if(current.start>=earliest.start)
            {
                earliest.end=current.end;
            }
            else
                minHeap.add(current);
        }
        return minHeap.size();
        
        
    }
}

