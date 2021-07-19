class SubstringSearch
{
    private boolean NaiveMethod(char[] text,char[] pattern)
    {
        int i=0;
        int j=0;
        int k=0;
        while(i<text.length && j<pattern.length)
        {
            if(text[i]==pattern[j])
            {
                i++;
                j++;
            }
            else
            {
                k++;
                j=0;
                i=k+1;
            }
        }
        if(j==pattern.length)
            return true;
        return false;
    }

    private int[] computeLPS(char[] pattern)
    {
        int lps[]=new int[pattern.length];
        int index=0;
        for(int i=1;i<pattern.length;i++)
        {

            if(pattern[index]==pattern[i])
            {
                lps[i]=index+1;
            }
            else
            {
                if(index!=0)
                {
                    index=lps[index-1];
                }
                else
                {
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }


    public boolean KMPMethod(char[] text,char[] pattern)
    {
        int lps[]=computeLPS(pattern);
        int i=0;
        int j=0;
        while(i<text.length && j<pattern.length)
        {
            if(text[i]==pattern[j])
            {
                i++;
                j++;
            }
            else
            {
                if(j!=0)
                    j=lps[j-1];
                else
                    i++;
            }
            
        }
        if(j==pattern.length)
            return true;
        
        return false;
    }
}


public class KMP {

    public static void main(String[] args) {
        String str = "abcxabcdabcdabcy";
        String subString = "abcdabcy";
        SubstringSearch ss = new SubstringSearch();
        boolean result = ss.KMPMethod(str.toCharArray(), subString.toCharArray());
        System.out.print(result);
    }
}


O(m+n)
O(m)
