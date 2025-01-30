package Stacks_And_Queues;

import java.util.Stack;

public class Implementing_Queue_Using_Stack_Insertion_Efficient {

   private Stack<Integer> first;
   private Stack<Integer> second;

    public void add(int n)
    {
          first.push(n);
    }
    public int remove()
    {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        int removed=second.pop();
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return removed;
    }
    public int peek()
    {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        int peeked=second.peek();
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
        return peeked;
    }
    public boolean isEmpty()
    {
        return first.isEmpty();
    }
    public static void main(String[] args) {

    }
}
