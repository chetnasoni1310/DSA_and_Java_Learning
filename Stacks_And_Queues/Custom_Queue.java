package Stacks_And_Queues;

public class Custom_Queue {
    public int[]data;
    private static final int DEFAULT_SIZE = 10;

    public Custom_Queue(int size) {
        this.data=new int[size];
    }

    public Custom_Queue() {
        this(DEFAULT_SIZE);
    }
    int end=-1;
    public boolean isFull() {
        if(end== data.length -1)
        {
            return true;
        }
        return false;
    }
    public boolean isEmpty()
    {
        if(end==-1)
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
        data[++end]=val;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Empty queue");
        }
       int remove=data[0];
       for(int i=1;i<data.length;i++)
       {
           data[i-1]=data[i];
       }
       end--;
       return remove;
    }

    public void display(){
        if(isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        for(int i=0;i<end;i++)
        {
            System.out.print(data[i]+" <- ");
        }
        System.out.println("End");
    }
}
