package Stacks_And_Queues;

public class Queue_Main {
    public static void main(String[] args) throws Exception {
        Custom_Queue queue=new Custom_Queue(6);
//        queue.add(23);
//        queue.add(3);
//        queue.add(678);
//        queue.add(4);
//        queue.add(7);
//        queue.add(90);
////        queue.add(30);
//        queue.display();
//
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        queue.remove();
////        queue.remove();
//        queue.display();

        Circular_Queue que=new Circular_Queue();
        que.add(23);
        que.add(3);
        que.add(678);
        que.add(4);
        que.add(7);
        que.add(90);
//        que.add(30);
        que.display();

        que.remove();
//        que.remove();
//        que.remove();
//        que.remove();
        que.display();

        que.remove();
        que.remove();
//        que.remove();
        que.display();

    }
}
