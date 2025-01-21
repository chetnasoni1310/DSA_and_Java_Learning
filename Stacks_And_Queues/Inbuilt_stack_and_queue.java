package Stacks_And_Queues;

import java.util.*;

public class Inbuilt_stack_and_queue {
    public static void main(String[] args) {
        Stack<Integer> stack =new Stack<>();
        stack.push(23);
        stack.push(2);
        stack.push(45);
        stack.pop();
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.peek());



        Queue<Integer> queue=new LinkedList<>();
        queue.add(23);
        queue.add(3);
        queue.add(678);
        System.out.println(queue.remove());



        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(34);
        deque.add(56);
        deque.add(77);
        deque.add(9);
        deque.addFirst(344);
        System.out.println(deque.remove());



    }
}
