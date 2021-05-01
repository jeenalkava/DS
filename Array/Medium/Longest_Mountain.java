class Solution {
    public int longestMountain(int[] arr) {
        int ans=0;
        for(int i=1;i<arr.length;i++)
        {
            boolean flag =false;
            int j=i;
            int count=1;
            while(j<arr.length && arr[j]>arr[j-1])
            {
                j++;
                count++;
            }
            while( i!=j  && j<arr.length && arr[j]<arr[j-1])
            {
                j++;
                count++;
                flag=true;
            }
            if(i!=j && flag && count>2)
            {
                ans=Math.max(count,ans);
                j--;
            }
            i=j;
        }
        return ans;
    }
}

Time complexity=o(n)
    Space = o(1)
