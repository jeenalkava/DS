class BinarySearchTree{
    class Node{
        int key;
        Node left,right;

       public  Node(int data)
        {
            this.key=data;
        }
    }
    Node root;
    public BinarySearchTree()
    {
        root=null;
    }
    public void deleteKey(int key)
    {
        root=deleteRecursive(root,key);
    }
    public Node deleteRecursive(Node root,int key)
    {
        if (root==null)
            return root;
        if(key<root.left.key)
            deleteRecursive(root.left,key);
        else if(key>root.right.key)
            deleteRecursive(root.right,key);
        else{
            //one node null
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;

            //both child present
            root.key=minNodeFromRight(root.right);
            root.right=deleteRecursive(root.right,root.key);



        }
        return root;
    }
    int minNodeFromRight(Node root)
    {
        int minValue=root.key;
       while(root.left!=null)
       {
           minValue=root.key;
           root=root.left;
       }
       return minValue;
    }
    public void insert(int key)
    {
        root=insert_Recursive(root,key);
    }
    public Node insert_Recursive(Node root,int key)
    {
        //empty tree
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        if(key<root.key)
            root.left=insert_Recursive(root.left,key);
        else if(key>root.key)
            root.right=insert_Recursive(root.right,key);
        return root;
    }
    void inorder() {
        inorder_Recursive(root);
    }

    // recursively traverse the BST
    void inorder_Recursive(Node root) {
        if (root != null) {
            inorder_Recursive(root.left);
            System.out.print(root.key + " ");
            inorder_Recursive(root.right);
        }
    }

    boolean search(int key)  {
        root = search_Recursive(root, key);
        if (root!= null)
            return true;
        else
            return false;
    }

    //recursive insert function
    Node search_Recursive(Node root, int key)  {
        // Base Cases: root is null or key is present at root 
        if (root==null || root.key==key)
            return root;
        // val is greater than root's key 
        if (root.key > key)
            return search_Recursive(root.left, key);
        // val is less than root's key 
        return search_Recursive(root.right, key);
    }

}
