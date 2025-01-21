package LinkedList;

public class Main_Circular {
    public static void main(String[] args) {
        Circular_LL list=new Circular_LL();
        list.insertAt_first(1);
        list.insertAt_first(2);
        list.insertAt_first(3);
        list.insertAt_first(4);
        list.insertAt_first(5);
        list.insertAt_first(6);
        list.display();
        list.delete(4);
        list.display();
        list.delete(4);
        list.display();
    }
}
