package TREE;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Binary_Tree_Implementation {


    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int value) {
            this.val=value;
        }

    }

    private static Node root;

    public static void populate(Scanner sc)
    {
        System.out.print("Enter the root node : ");
        int value= sc.nextInt();

       root=new Node(value);
        populate(sc,root);
    }
    private static void populate(Scanner sc,Node node)
    {
        System.out.print("Do you want to insert left of root "+node.val+" : ");
        boolean left=sc.nextBoolean();

        if(left)
        {
            System.out.print("Enter left node value of "+node.val+" : ");
            int leftValue=sc.nextInt();
            node.left=new Node(leftValue);
            populate(sc,node.left);
        }


        System.out.print("Do you want to insert right of root "+node.val+" : ");
        boolean right=sc.nextBoolean();

        if(right)
        {
            System.out.print("Enter right node value of "+node.val+" : ");
            int rightValue=sc.nextInt();
            node.right=new Node(rightValue);
            populate(sc,node.right);
        }
    }

    public static void display()
    {
        display(root,0);
    }
    private static void display(Node node,int level)
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        populate(sc);
        display();
    }
}
