public class BinarySearchTree {
    public static void main(String[] args) {
        BST root=new BST(5);
        root.insertIterative(2);
        root.insertIterative(7);
        root.insertIterative(4);
        root.insertIterative(6);

        System.out.println("===================");
        root.printInOrder();// 2 4 5 6 7
        System.out.println("===================");
        root.printPostOrder();// 4 2 6 7 5
        System.out.println("===================");
        root.printPreOrder();// 5 2 4 7 6
        System.out.println("===================");
    }
}

    class BST{
        int data;
        BST left;
        BST right;

        BST(int data)
        {
            super();
            this.data=data;

        }
        public void insert(int data)
        {
            if(data<=this.data)
            {
                if(this.left==null)
                {
                    this.left=new BST(data);
                }
                else
                    left.insert(data);
            }
            else
            {
                if(this.right==null)
                {
                    this.right=new BST(data);
                }
                else{
                    right.insert(data);
                }
            }
        }
        public void insertIterative(int data){
            BST curr=this;
            while(curr!=null)
            {
                if(data<=curr.data)
                {
                    if(curr.left==null)
                    {
                        curr.left=new BST(data);
                        break;
                    }
                        curr= curr.left;
                }
                else
                {
                    if(curr.right==null)
                    {
                        curr.right=new BST(data);
                        break;
                    }
                    curr= curr.right;

                }
            }
        }
        public boolean contains(int data)
        {
            if(this.data==data)
                return true;
            else if(data<this.data)
            {
                if(this.left==null)
                    return false;
                else
                    return left.contains(data);
            }
            else
            {
                if(this.right==null)
                    return false;
                else
                    return right.contains(data);

            }
        }
        public BST delete(int val,BST root)
        {
          if(root==null)
              return root;
          if(val<root.data){
              root.left=delete(val,root.left);
          }
          else if(val>root.data)
          {
              root.right=delete(val,root.right);
          }
          else
          {
              //both children
              if(root.left!=null && root.right!=null)
              {
                  BST temp=root;
                  BST minNodeRight=minNode(temp.right);
                  root.data=minNodeRight.data;
                  root.right=delete(minNodeRight.data,root.right);

              }

              // if nodeToBeDeleted has only left child
              else if (root.left != null) {
                  root = root.left;
              }
              // if nodeToBeDeleted has only right child
              else if (root.right != null) {
                  root = root.right;
              }
              // if nodeToBeDeleted do not have child (Leaf node)
              else
                  root = null;
          }
            return root;
        }

        public BST minNode(BST root)
        {
            if(root.left==null)
            {
              return root;
            }
            else
                return minNode(root.left);
        }
        public  void inOrder(BST root) {
            if (root == null)
                return;
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

