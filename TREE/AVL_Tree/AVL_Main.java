package TREE.AVL_Tree;

public class AVL_Main {
    public static void main(String[] args) {
        AVL avl=new AVL();
        avl.populate(new int[]{13,10,15,6,5,7,11,16});
        avl.display();
        System.out.println( avl.getHeightOfNode(6));
        System.out.println("Displayed height : " + avl.getHeightOfNode(6));

    }
}
