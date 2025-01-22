package LinkedList;

//In Java, a class can't be private unless it is a nested class.
class MyException_Of_Position extends Exception
{
    public MyException_Of_Position(String message) {
        super(message);
    }
}
public class LL_singly {

    private class Node{                              //>>>>>>>>>>>>>>>>>>>>>>>>>>>
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public LL_singly() {
        this.size = 0;
    }
    public void insert_Atfirst(int val)             //>>>>>>>>>>>>>>>>>>>>>>>>>>>
    {
          Node newnode=new Node(val);
          newnode.next=head;
          head=newnode;

          if(tail==null)
          {
              tail=newnode;
          }
          size++;
    }

  public void insert_Atlast_USing_HEAD(int val)            //>>>>>>>>>>>>>>>>>>>>>>>>>>>
    {
        if(head==null)
        {
            insert_Atfirst( val);
            return;
        }
        else
        {
            Node temp = head;

            while (temp.next != null)
            {
                temp = temp.next;
            }
                Node newnode=new Node(val);
                temp.next = newnode;
                tail=newnode;
        }
        size++;
    }

    public void insert_at_last_USing_TAIL(int val)          //>>>>>>>>>>>>>>>>>>>>>>>>>>>
    {
        Node newnode=new Node(val);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            return;
        }
       tail.next=newnode;
        tail=newnode;
        size++;
    }


    public void insert_At_specific_index(int val,int position)  //>>>>>>>>>>>>>>>>>>>>>>>>>>>
    {
        if(position==0)
        {
            insert_Atfirst(val);
            return;
        }
        if(position==size)
        {
          insert_at_last_USing_TAIL(val);
          return;
        }
      try {
          if (position >= size) {
               throw new MyException_Of_Position(
                       "               ****  You should check your index at which you want to " +
                       "insert the new node ****");
          }
      }
      catch (Exception e)
      {
          System.out.println(e.getMessage());
      }

        Node newnode=new Node(val);
        Node temp=head;
        int i=position-1;
        while(i>1)
        {
            temp=temp.next;
            i--;
        }
        Node temp2=temp.next;
        temp.next=newnode;
        newnode.next=temp2;
        size++;
    }
    public void Insert_Using_Recursion(int val,int index)
    {
        head=Insert_Using_Recursion(head,val,index);
    }
    private Node Insert_Using_Recursion(Node node,int val,int index)
    {
        if(index==0)
        {
            Node newnode=new Node(val,node);
            size++;
            return newnode;
        }

        node.next=Insert_Using_Recursion(node.next,val,--index);
       return node;
    }


    public void display(){                                //>>>>>>>>>>>>>>>>>>>>>>>>>>>
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void size(){                         //>>>>>>>>>>>>>>>>>>>>>>>>>>>
        System.out.println(size);
    }
    public Node getNode(int index)
    {
        Node getting_node=head;
        while(index-->0)
        {
            getting_node=getting_node.next;
        }
        return getting_node;
    }
    public int getNodeValue(int index)
    {
        Node getting_node=head;
        while(index-->0)
        {
            getting_node=getting_node.next;
        }
        return getting_node.value;
    }










    public void deleteFirst()              //>>>>>>>>>>>>>>>>>>>>>>>>>>>
    {
        head=head.next;
        size--;
        if(head==null)
        {
            tail=null;
        }
                                            //        if want value which is going to be removed ::is
                                            //            int val=head.value;
                                            //        return val;
    }
    public void deleteLast_Using_Head()    //>>>>>>>>>>>>>>>>>>>>>>>>>>>
    {
        if(size==1)
        {
            deleteFirst();
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }
    public void delete_Last_Using_Tail()    //>>>>>>>>>>>>>>>>>>>>>>>>>>>
    {
         //sout
        System.out.println("\nNahi kr skte ese using head hi hoga");
        deleteLast_Using_Head();
    }

    public void delete_Last_Using_Get_Node_2nd_Last()   //>>>>>>>>>>>>>>>>>>>>>>>>>>>
    {
        if(size<=1)
        {
            deleteFirst();
            return;
        }
        Node secondlast=getNode(size-2);
                                        //        if we want deleted value:
                                        //        int val=tail.value;
                                        //        int val= secondlast.next.value;
        tail=secondlast;
        tail.next=null;
        size--;
    }

    public void delete_at_specific_index(int index)      //>>>>>>>>>>>>>>>>>>>>>>>>>>>
    {
        if(size<=1)
        {
            deleteFirst();
            return;
        }
        Node prev=getNode(index-1);
//        Node nextt=getNode(index+1);
//        this can also be get from:
        prev.next=prev.next.next;
    }











}
