class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        
        int rows=matrix.length;
        int columns=matrix[0].length;
        
        int left=0;
        int right=rows*columns-1;
        
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int mid_point=matrix[mid/columns][mid%columns];
            if(target==mid_point)
                return true;
            else if(target<mid_point)
                right=mid-1;
            else if(target>mid_point)
                left=mid+1;
                 
        }
        return false;
        
    }
}


Time : O(logn)
Space : O(1)
