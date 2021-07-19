class Solution {
    public boolean isPalindrome(String s) {
      String finalString="";
      for(char a : s.toCharArray())
      {
          if(Character.isLetterOrDigit(a))
              finalString+=a;
      }
      finalString=finalString.toLowerCase();
      int i=0;
      int j=finalString.length()-1;
      while(i<j)
      {
          if(finalString.charAt(i)!=finalString.charAt(j))
              return false;
          i++;
          j--;
      }
      return true;
        
            
        
    }
}
Time : O(n)
Space : O(n)
