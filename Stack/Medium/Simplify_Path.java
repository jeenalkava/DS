class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack =new Stack<>();
        String[] sub_path=path.split("/");
        
        for(String val : sub_path)
        {
            if(val.equals("..") && !stack.isEmpty())
                stack.pop();
            
            else if(!val.equals(".") && !val.equals("..") && !val.equals(""))
                stack.push(val);
        }
        return "/"+String.join("/",stack);
        
    }
}


Time :  O(n)
Space : O(n)
