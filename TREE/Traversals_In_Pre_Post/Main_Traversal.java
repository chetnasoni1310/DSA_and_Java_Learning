package TREE.Traversals_In_Pre_Post;

public class Main_Traversal {
    public static void main(String[] args) {

        Traversals preorder=new Traversals();
        preorder.populate(new int[]{10,20,12,15,13});
        preorder.display();
        preorder.PreOrder();


        System.out.println("/*********************************************************/");
        Traversals inorder=new Traversals();
        inorder.populate(new int[]{10,20,12,15,13});
        inorder.display();
        inorder.InOrder();


        System.out.println("/*********************************************************/");
        Traversals postorder=new Traversals();
        postorder.populate(new int[]{10,20,12,15,13});
        postorder.display();
        postorder.PostOrder();


        System.out.println("/*********************************************************/");
    }
}
