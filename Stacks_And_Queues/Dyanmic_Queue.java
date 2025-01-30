package Stacks_And_Queues;

public class Dyanmic_Queue extends Circular_Queue{
    public Dyanmic_Queue(int size) {
        super(size);
    }

    public Dyanmic_Queue() {
        super();
    }

    @Override
    public boolean add(int val) throws Exception {
        if(isFull())
        {
            int[]temp= new int[data.length *2];
            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[ (front+i) % data.length];
            }
            front=0;
            end=data.length;
            data=temp;
        }
        return super.add(val);
    }
}
