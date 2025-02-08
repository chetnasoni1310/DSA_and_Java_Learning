package TREE.AVL_Tree;

import TREE.BST_Binary_Search_Tree_Implementation;

public class AVL {
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

    private Node root;

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

    public int getHeightOfNode(int val) {
        return getHeightOfNode(root, val);
    }

    private int getHeightOfNode(Node node, int val) {
        if (node == null) {
            return -1; // Node not found
        }

        if (node.val == val) {
            return node.height;
        }
        else if (val < node.val) {
            return getHeightOfNode(node.left, val);
        }
        else {
            return getHeightOfNode(node.right, val);
        }
    }
    /************************************************************************************************/

    public boolean isEmpty(Node node)
    {
        return node==null;
    }

    /***********************************************************************************************/

    public void insertion(int val)
    {

        root =insertion(val , root);
    }
    private Node insertion(int val ,Node node)
    {
        if(node==null)
        {
            node=new Node(val);
            return node;
        }

        if(val<node.val)
        {
            node.left=insertion(val , node.left);
        }

        else if(val> node.val)
        {
            node.right=insertion(val , node.right);
        }

        node.height=Math.max( height(node.left) , height(node.right))+1;
        return node;
    }
    /************************************************************************************************/

private Node rotate(Node node)
{
    if(height(node.left)-height(node.right)>1)
    {
        //Left heavy hai
        if(height(node.left.left)-height(node.left.right)>0)
        {
            //Left-Left (LL) case
            //Right rotate on Parent Node
            return rightRotate(node);
        }
        if(height(node.left.left)-height(node.left.right)<0)
        {
            //Left-Right(LR) case
            //Left rotate on Child C then Right rotate on Parent P
            node.left=leftRotate(node.left);
            return rightRotate(node);
        }
    }
    if( height(node.right)- height(node.left)>1)
    {
        //Right Heavy
        if(height(node.right.right)-height(node.right.left)>0)
        {
            //Right-Right (RR) case
            //Left Rotate on Parent P
            return leftRotate(node);
        }
        if(height(node.right.right)-height(node.right.left)<0)
        {
            //Right Left (RL) case
            //Right rotate on Child C then Left Rotate on Parent P
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }
    }
     return node;
}

    /************************************************************************************************/

    private Node leftRotate(Node node)
    {
        Node Child=node.right;
        Node temp=node.right.left;

        Child.left=node;
        node.right=temp;

        node.height=Math.max(height(node.left) , height(node.right)) +1;
        Child.height=Math.max(height(Child.left) , height(Child.right)) +1;

        return Child;
    }

    private Node rightRotate(Node node)
    {
        Node Child=node.left;
        Node temp=node.left.right;

        Child.right=node;
        node.left=temp;

        node.height=Math.max(height(node.left) , height(node.right)) +1;
        Child.height=Math.max(height(Child.left) , height(Child.right)) +1;

       return Child;
    }

    /************************************************************************************************/




    public void populate(int[]nums)
    {
        for(int i=0;i< nums.length;i++)
        {
            insertion(nums[i]);
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
        insertion(nums[mid]);
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