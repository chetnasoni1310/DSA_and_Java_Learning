package LinkedList;

public class Main_Singly {
    public static void main(String[] args) {
        LL_singly list=new LL_singly();

        list.insert_Atlast_USing_HEAD(56);
        list.insert_Atlast_USing_HEAD(67);
        list.display();
        list.size();


        list.insert_at_last_USing_TAIL(90);
        list.insert_at_last_USing_TAIL(45);
        list.display();
        list.size();

        list.insert_At_specific_index(999,3);
        list.display();
        list.size();

//        list.insert_At_specific_index(99,0);
//        list.display();
//        list.size();
//        list.insert_At_specific_index(0,8);
//        list.display();
//        list.size();

//         list.deleteFirst();
//         list.display();
//         list.deleteLast_Using_Head();
//         list.display();
//         list.delete_Last_Using_Tail();
//         list.display();



        System.out.println(list.getNode(3));
        System.out.println(list.getNodeValue(3));

        list.delete_Last_Using_Get_Node_2nd_Last();
        list.display();


        list.delete_at_specific_index(2);
        list.display();

    }
}
