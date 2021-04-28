class Solution {
    public boolean isMonotonic(int[] a) {
        
        int i=0,c=-1;
        boolean flag=true,p=true;
        while(i<a.length-1)
        {
            if(p)
            {
                if(a[i+1]<a[i])
                {
                    c=0;
                    p=false;
                }
                else if(a[i+1]>a[i])
                {
                    c=1;
                    p=false;

                }
            }
            if(c==-1)
             i++;
            else
            {
                if(c==0)
                {
                    if(a[i+1]<=a[i])
                        i++;
                    else
                        {
                    flag=false;
                    break;
                }
                    
                }
                else if(c==1)
                {
                    if(a[i+1]>=a[i])
                        i++;
                    else
                        {
                    flag=false;
                    break;
                }
                }
                // else
                // {
                //     flag=false;
                //     break;
                // }
            }
            
            
        }
        if(flag)
                return true;
            else
                return false;
            
    }
}
