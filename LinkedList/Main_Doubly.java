package LinkedList;

public class Main_Doubly {
    public static void main(String[] args) {
        LL_doubly list=new LL_doubly();
        list.insert_at_first(1);
        list.insert_at_first(2);
        list.insert_at_first(23);
        list.insert_at_first(13);

        list.display();
        list.display_reverse_using_tail();

    }
}
