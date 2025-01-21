package Stacks_And_Queues;

public class Circular_Queue {
    public int[]data;
    private static final int DEFAULT_SIZE = 10;

    public Circular_Queue(int size) {
        this.data=new int[size];
    }

    public Circular_Queue() {
        this(DEFAULT_SIZE);
    }
    public boolean isFull() {
        if(end== data.length -1)
        {
            return true;
        }
        return false;
    }
    int end=0;
    int front=0;
    int size=0;
    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        return false;
    }
    public boolean add(int val) throws Exception {
        {
            if(isFull()) {
                System.out.println("Full !!");
                throw new Exception("Full queue");
            }
        }
        data[end++]=val;
        end=end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty())
        {
            throw new Exception("Empty queue");
        }
        int remove=data[front];
        front++;
        front=front % data.length;
        size--;
        return remove;
    }

    public int front() throws Exception {
        if(isEmpty())
        {
            throw new Exception("Empty queue");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        int i=front;
        do
        {
            System.out.print(data[i]+" <- ");
            i++;
            i=i% data.length;
        }while(i!=end);
        System.out.println("End");
    }


}
