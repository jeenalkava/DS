class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        int min= Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
           min=Math.min((arr[i]-arr[i-1]),min);
        
        }
        System.out.println(min);
       
        for(int i=1;i<arr.length;i++)
        {
            List<Integer> temp=new ArrayList<>();
            if((arr[i]-arr[i-1])==min)
            {
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                 result.add(temp);
            }
           
        }
        return result;
        
    }
}
