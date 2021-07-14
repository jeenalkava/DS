class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>();
         for(int i = 0; i < nums.length; i++) {
              map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
        (n1, n2) -> n2.getValue() - n1.getValue());
        
         maxHeap.addAll(map.entrySet());
        
         int[] ans=new int[k];
         for(int i = 0; i < k && !maxHeap.isEmpty(); i++) {
              ans[i]=maxHeap.poll().getKey();
    }
    
    return ans;
        
    }
}

Klog(N)
N
