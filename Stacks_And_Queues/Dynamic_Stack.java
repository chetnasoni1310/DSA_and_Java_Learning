package Stacks_And_Queues;

public class Dynamic_Stack extends Custom_Stack{

    public Dynamic_Stack(int size) {
        super(size);
    }

    public Dynamic_Stack() {
        super();
    }

    @Override
    public boolean push(int val) throws Custom_Exception {
        if(isFull())
        {
            int[]temp=new int[data.length *2];
            for(int i=0;i< data.length;i++)
            {
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(val);
    }
}
