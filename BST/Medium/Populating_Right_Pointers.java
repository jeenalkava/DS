class Solution {
    public Node connect(Node root) {
        if(root==null)
            return null;
        
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
            
                Node node=queue.remove();
                if(i==size-1)
                    node.next=null;
                else
                    node.next=queue.peek();
                 
                if(node.left!=null)
                    queue.add(node.left);
                 if(node.right!=null)
                    queue.add(node.right);
                 
                
            }
        }
        return root;
        
    }
}
