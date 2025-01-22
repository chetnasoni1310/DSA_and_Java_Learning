package LinkedList.Questions;

public class QuesLeetCode {

    class ListNode                           //  ****************************************************************
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) { //  ****************************************************************
        ListNode temp=head;
        while(temp!=null && temp.next!=null )
        { if(temp.val==temp.next.val)
        {
            temp.next=temp.next.next;
        }
        else{
            temp=temp.next;
        }
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) { //  ***************************************************
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=new ListNode(-1);
        ListNode temp3=head;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.val<=temp2.val)
            {
                temp3.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp3.next=temp2;
                temp2=temp2.next;
            }
            temp3=temp3.next;
        }
        if(temp1!=null)
        {
            temp3.next=temp1;
        }
        if(temp2!=null)
        {
            temp3.next=temp2;
        }
        return head.next;
    }
    public boolean hasCycle(ListNode head) { //  ****************************************************************
        if(head==null || head.next==null)
        {
            return false;
        }
        ListNode slow=head;        //Tortoise
        ListNode fast=head.next;   //Hare

        while(fast!=null && fast.next!=null)
        {
            if(fast==slow)
            {
                return true;
            }

            fast=fast.next.next;
            slow=slow.next;
        }
        return false;
    }
    //  ****************************************************************
    public int lengthOf_cyclee(ListNode head,ListNode Meeting_Point)
    {
        int length=0;
        ListNode slow=Meeting_Point;
        ListNode fast=Meeting_Point;

        do{
            length++;
            slow=slow.next;
        }while(slow!=fast);
        return length;
    }

    //  ****************************************************************
    public boolean isHappy(int n) {
        //Using LinkedList Cycle Detection Algorithm

        int fast=n;
        int slow=n;
        do{
            slow=squareSum(slow);
            fast=squareSum(squareSum(fast));

            if(slow==1)
            {
                return true;
            }
        }while(fast!=slow);
        return false;
    }
    private int squareSum(int n)
    {
        int ans=0;
        while(n>0)
        {
            int rem=n%10;
            ans+=rem*rem;
            n=n/10;
        }
        return ans;
    }

    //  ****************************************************************
    public ListNode middleNode(ListNode head) {
        int middle= length(head) /2;
        return getNode(head,middle);
    }
    private ListNode getNode(ListNode head,int k)
    {
        ListNode temp=head;
        while(temp!=null && k>0)
        {
            temp=temp.next;
            --k;
        }
        return temp;
    }
    private int length(ListNode head)
    {
        ListNode temp=head;
        int length=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            length++;
        }
        return length;
    }
    //  ****************************************************************
    public ListNode middleNode(ListNode head) {

        //Method 1
      /*   int middle= length(head) /2;
        return getNode(head,middle);  */

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    private ListNode getNode(ListNode head,int k)
    {
        ListNode temp=head;
        while(temp!=null && k>0)
        {
            temp=temp.next;
            --k;
        }
        return temp;
    }
    private int length(ListNode head)
    {
        ListNode temp=head;
        int length=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            length++;
        }
        return length;
    }
    //  ****************************************************************
   
}