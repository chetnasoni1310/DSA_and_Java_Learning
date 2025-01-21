package Stacks_And_Queues;

public class Stack_Main {
    public static void main(String[] args) throws Custom_Exception {

        Custom_Stack stackdy=new Dynamic_Stack(3);
        //Should use above for implementation

        Custom_Stack stack=new Custom_Stack(5);
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(35);
        stack.push(78);
//        stack.push(78);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
//        stack.pop();



        Dynamic_Stack dy=new Dynamic_Stack(3);
        dy.push(34);
        dy.push(2);
        dy.push(4);
        dy.push(35);
        dy.push(78);
    }
}
