package TREE.Traversals_In_Pre_Post;

import TREE.BST_Binary_Search_Tree_Implementation;

public class Traversals {
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

    public void PreOrder()
    {
        preOrder(root);
    }
    private void preOrder(Node node)
    {
       if(node==null)
       {
           return;
       }
        System.out.print(node.val+" _ ");
        preOrder(node.left);
        preOrder(node.right);
    }


    /************************************************************************************************/

    public void InOrder()
    {
        inOrder(root);
    }
    private void inOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+" _ ");
        inOrder(node.right);
    }


    /************************************************************************************************/
    public void PostOrder()
    {
        PostOrder(root);
    }
    private void PostOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.val+" _ ");
    }

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


}
