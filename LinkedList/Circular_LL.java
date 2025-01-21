package LinkedList;

public class Circular_LL {

    private class Node
    {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, int val) {
            this.next = next;
            this.val = val;
        }
    }
    Node head;
    Node tail;
    int size=0;

    public Circular_LL() {
        this.size=0;
    }
    public void insertAt_first(int val)
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            newnode.next=head;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
        tail=newnode;
        size++;
    }
    public void display() {
        Node temp=head;
        do
        {
            System.out.print(temp.val +" -> ");
            temp=temp.next;

        }while(temp!=head);
        System.out.println(head.val+" =Head");
    }

    public void delete(int val)
    {
        Node toRemove_prev=getNode(val);
        toRemove_prev.next=toRemove_prev.next.next;
    }
    public int deleted_value(int val)
    {
        Node toRemove_prev=getNode(val);
        toRemove_prev.next=toRemove_prev.next.next;
        return val;
    }
//lecture dekh lena logic glt h thoda sa mera aalas aa rha h thak gyi
    private Node getNode(int val) {
        if(size==1)
        {
            return head;
        }

        Node temp=head;
        while(temp.next.val!=val )
        {
            temp=temp.next;
        }
        return temp;
    }
}
