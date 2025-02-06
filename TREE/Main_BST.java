package TREE;

import OOPS.Interfaces.InterfacesExtendsEachOther.B;

public class Main_BST {
    public static void main(String[] args) {
        BST_Binary_Search_Tree_Implementation bst=new BST_Binary_Search_Tree_Implementation();
        //WRONG IMPLEMENTATION
//        bst.insert(15);
//        bst.insert(10);
//        bst.insert(5);
//        bst.insert(6);
//        bst.insert(21);
//        bst.insert(20);

//        bst.display();


        System.out.println(" /************************************************************************************************/");

        BST_Binary_Search_Tree_Implementation bstKunal=new BST_Binary_Search_Tree_Implementation();
        bstKunal.Kunal_insertion(15);
        bstKunal.Kunal_insertion(10);
        bstKunal.Kunal_insertion(5);
        bstKunal.Kunal_insertion(6);
        bstKunal.Kunal_insertion(21);
        bstKunal.Kunal_insertion(20);
//        bstKunal.display();


        System.out.println(" /************************************************************************************************/");

        BST_Binary_Search_Tree_Implementation bstPopulate=new BST_Binary_Search_Tree_Implementation();
        bstPopulate.populate(new int[]{1,3,4,6,7,8,34,5,234});
//        bstPopulate.display();

        System.out.println(" /************************************************************************************************/");

//       bstPopulate.DisplayDetails();

        System.out.println(" /************************************************************************************************/");
        BST_Binary_Search_Tree_Implementation bstPopulateSorted=new BST_Binary_Search_Tree_Implementation();
        bstPopulateSorted.PopulateSortedArray(new int[]{5,7,9,13,21,29});
        bstPopulateSorted.display();
        bstPopulateSorted.DisplayDetails();
    }
}
