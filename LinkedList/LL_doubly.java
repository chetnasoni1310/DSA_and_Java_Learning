package LinkedList;

public class LL_doubly {
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LL_doubly() {
        this.size = size;
    }


    public void insert_at_first(int val)            //>>>>>>>>>>>>>>>>>>>>>>>>>>>
    {
        Node newnode = new Node(val);
        if (size == 0) {
            head = newnode;
            tail = newnode;
            size++;
            return;
        }
        Node temp = head;
        temp.prev = newnode;
        newnode.next = temp;
        head = newnode;
        size++;
    }

    public void insert_at_last(int val) {

    }

    public void display() {                                //>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Node temp = head;
        System.out.print("START <--> ");
        while (temp != null) {
            System.out.print(temp.value + " <--> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void display_reverse_using_tail() {                  //>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Node temp = tail;

        System.out.print("END <--> ");
        if (size < 1) {
            System.out.println("START");
            return;
        }

        while (temp != null) {
            System.out.print(temp.value + " <--> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }




}
