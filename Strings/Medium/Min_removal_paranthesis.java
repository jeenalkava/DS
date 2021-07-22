class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder s1=new StringBuilder();
        int open=0;
        for(char c:s.toCharArray())
        {
            if(c=='(')
                open++;
            else
            {
                if(c==')')
                {
                    if(open==0) continue;
                    open--;
                }
            }
            s1.append(c);
        }
        StringBuilder result=new StringBuilder();
        for(int i=s1.length()-1;i>=0;i--)
        {
            if(s1.charAt(i)=='(' && open-- > 0) continue;
            {
                result.append(s1.charAt(i));
            }
        }
        
        return result.reverse().toString();
        
        
    }
}

//Time : O(n)
//Space : O(n)
