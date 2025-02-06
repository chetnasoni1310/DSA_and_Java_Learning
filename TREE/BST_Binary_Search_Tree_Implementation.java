package TREE;

import java.util.Scanner;

public class BST_Binary_Search_Tree_Implementation {

    private  class Node {
        int val;
        Node left;
        Node right;
        int height;

        public Node(int val) {
            this.val = val;
            this.height = 0;
        }
    }

    private  Node root;

    /************************************************************************************************/

    public int height(Node node)
    {
        if(node==null)
        {
            return -1;
        }
        return node.height;
    }

    /************************************************************************************************/

   public boolean isEmpty(Node node)
   {
       return node==null;
   }

    /***********************************************************************************************

     -->> Wrong method because it doesn't updated node
     -->>   insert(int val) directly modifies root, but the recursive function insert(val, root) does not return the updated node.
     -->>  This means that subtree updates are lost, and the tree structure could be broken.


     public void insert(int val)
    {
        if(root==null)
        {
            root=new Node(val);
        }
        else
            insert(val,root);
    }
    private  void insert(int val , Node node)
    {
        if(val<node.val) //Left side
        {
            if(node.left==null)
            {
                node.left=new Node(val);
            }
            else{
                insert(val,node.left);
            }
        }
        else{ //Right Side
            if(node.right==null)
            {
                node.right=new Node(val);
            }
            else{
                insert(val,node.right);
            }
        }

        node.height=Math.max(height(node.left)  , height(node.right)) +1 ;
    }
     */
    /************************************************************************************************/
   public void Kunal_insertion(int val)
   {

      root =Kunal_insertion(val , root);
   }
   private Node Kunal_insertion(int val , Node node)
   {
       if(node==null)
       {
           node=new Node(val);
           return node;
       }

       if(val<node.val)
       {
           node.left=Kunal_insertion(val , node.left);
       }

      else if(val> node.val)
       {
           node.right=Kunal_insertion(val , node.right);
       }

       node.height=Math.max( height(node.left) , height(node.right))+1;
       return node;
   }
    /************************************************************************************************/

    public void populate(int[]nums)
    {
        for(int i=0;i< nums.length;i++)
        {
            Kunal_insertion(nums[i]);
        }
    }
    /************************************************************************************************/


    public void PopulateSortedArray(int[]nums)
    {
        PopulateSorted(nums, 0,nums.length);

    }

    private void PopulateSorted(int[]nums , int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid=start+(end-start)/2 ;
        Kunal_insertion(nums[mid]);
        PopulateSorted(nums ,start,mid);
        PopulateSorted(nums,mid+1,end);
    }
    /************************************************************************************************/

    public  void display()
    {
        display(root,0);
    }
    private  void display(Node node, int level)
    {
        if(node==null)
        {
            return;
        }

        display(node.right , level+1);

        if(level!=0) //Not root node
        {
            for(int i=0;i<level-1;i++)
            {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" +node.val);
        }
        else{
            //If root Node
            System.out.println(node.val);
        }

        display(node.left , level+1);
    }

    /************************************************************************************************/

    public void DisplayDetails(){
        DisplayDetails(this.root, "Root Node : ");
    }

    private void DisplayDetails(Node node , String details)
    {
        if(node==null)
        {
            return ;
        }

        System.out.println(details + node.val);

        DisplayDetails(node.left, "Left Child of "+node.val+" : ");
        DisplayDetails(node.right, "Right Child of "+node.val+" : ");

    }

    /************************************************************************************************/

    public boolean isBalance()
    {
        return isBalance(root);
    }

    private boolean isBalance(Node node)
    {
        if(node==null)
        {
            return true;
        }

        boolean isHeight_Of_Node_current_IsBalanced=Math.abs( height(node.left)-height(node.right) )<=1;
        boolean isLeftSubtreeBalanced= isBalance(node.left);
        boolean isRightSubtreeBalanced= isBalance(node.right);
        return isHeight_Of_Node_current_IsBalanced && isRightSubtreeBalanced && isLeftSubtreeBalanced ;
    }

    /************************************************************************************************/


}

