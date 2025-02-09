package TREE.SegmentTree;

public class ST_Main {

    public static void main(String[] args) {

        SegmentTree segmentTree =new SegmentTree();
        int[] arr= {3,8,7,6,-2,-8,4,9};
       segmentTree.insert(arr);
//       segmentTree.display();

//       segmentTree.DisplayDetails();

        System.out.println("/*********************************************/");
        System.out.println(segmentTree.querySum(arr ,2,6));

        segmentTree.update(3,14);
        System.out.println(segmentTree.querySum(arr ,0,7));
        System.out.println(segmentTree.querySum(arr ,2,6));

    }


}
