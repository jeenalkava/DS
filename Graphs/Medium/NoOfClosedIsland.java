class Solution {
    public int closedIsland(int[][] grid) {
        if(grid==null || grid.length==0 )
            return 0;
        
        int noClosedIslands=0;
        int rows=grid.length;
        int columns=grid[0].length;
        
        for(int i=1;i<rows-1;i++)
        {
            for(int j=1;j<columns-1;j++)
            {
                if(isClosedIslands(grid,i,j,rows,columns))
                    noClosedIslands++;
                    
            }
        }
        return noClosedIslands;
        
    }
    public boolean isClosedIslands(int[][] grid,int i,int j,int rows,int columns)
    {
            if(grid[i][j]==-1 || grid[i][j]==1)
            return true;
        
        if(i==0||j==0||i==rows-1||j==columns-1)
            return false;
    
        grid[i][j]=-1;
          boolean left=isClosedIslands(grid, i,j-1,rows,columns);
           
         boolean right=isClosedIslands(grid, i,j+1,rows,columns);
        
         boolean up=isClosedIslands(grid, i-1,j,rows,columns);
           
        boolean down=isClosedIslands(grid, i+1,j,rows,columns);
           
       
           
        
        
        return (up && down && left && right);
        
        
        
        
    }
}

N*m
N*m
