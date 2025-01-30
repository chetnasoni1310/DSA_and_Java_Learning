package Stacks_And_Queues;

import java.util.Stack;

public class Implementing_Queue_Using_Stack_Removal_Efficient {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public void push(int n)
    {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        first.push(n);
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
    }
    public int remove()
    {
       return first.pop();
    }
    public int peek()
    {

        return first.peek();
    }
    public boolean isEmpty()
    {
        return first.isEmpty();
    }
}
