package TREE.SegmentTree;

import TREE.BST_Binary_Search_Tree_Implementation;

public class SegmentTree {

    private class Node{
        int val;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval , int endInterval)
        {
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }

    private Node root ;


    /************************************************************************************************/

    public void insert(int[] arr)
    {
        this.root= insert(arr, 0 , arr.length-1);
    }

    private Node insert(int[]arr , int startInterval , int endInterval)
    {
        if(startInterval == endInterval)
        {
           Node node = new Node(startInterval , endInterval);
           node.val =arr[startInterval];
           return node ;
        }
         int mid= startInterval + (endInterval - startInterval) /2;

        Node node=new Node(startInterval , endInterval);

        node.left= insert(arr, startInterval , mid);
        node.right = insert(arr, mid+1, endInterval);


        node.val=node.left.val + node.right.val ;

        return node;
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

    public int querySum(int[]arr ,int startInterval  , int endInterval)
    {
        return query(this.root , startInterval ,endInterval);
    }
  private int query(Node node ,int startQ , int endQ )
    {

        //Case 1
        // Query is equal to node
        //Return its value
        if(node.startInterval==startQ && node.endInterval==endQ)
        {
            return  node.val ;
        }

        //Case 2
        // Query is completely outside the node
        //Return 0
        else if(node.startInterval>endQ || node.endInterval< startQ)
        {
            return  0;
        }

        //Case 3
        // Query is contained in Node
        //Call left and right children and ask them

            int leftSum= query(node.left , startQ ,Math.min(endQ , node.left.endInterval) );
            int rightSum= query(node.right , Math.max(startQ , node.right.startInterval), endQ );

            return leftSum+rightSum ;
    }
    /************************************************************************************************/


    public void update(int index , int value)
    {
        this.root=update(this.root , index ,value);
    }
    private  Node update(Node node, int index ,int value)
    {
        if(!(index>= node.startInterval && index<=node.endInterval))
        {
            return node;
        }

        if(index== node.startInterval && index== node.endInterval)
        {
            node.val=value ;
            return node;
        }
        node.left=update(node.left , index , value);
        node.right=update(node.right, index, value);

        node.val=node.left.val + node.right.val ;
        return node;
    }
    /************************************************************************************************/


}
