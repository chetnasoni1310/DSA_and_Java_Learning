package Stacks_And_Queues;
/**
@author Chetna Soni (chetnasoni1310@gmail.com)
@version 1.0
@since 2025
@see <a href="https://docs.oracle.com/en/java/javase/23/docs/api/index.html " target="_blank" >Java Docs</a>
 */
public class Custom_Stack {

    public int[]data;
    private static final int DEFAULT_SIZE = 10;

    public Custom_Stack(int size) {
        this.data=new int[size];
    }

    public Custom_Stack() {
        this(DEFAULT_SIZE);
    }
    int ptr=-1;
    public boolean push(int val) throws Custom_Exception {
        if(isFull())
        {
            System.out.println("Stack is full");
//            return false;
            throw new Custom_Exception("Stack is full");
        }
        ptr++;
        data[ptr]=val;
        return true;
    }

    public boolean isFull() {
        if(ptr== data.length -1)
        {
            return true;
        }
        return false;
    }
    public boolean isEmpty()
    {
        if(ptr==-1)
        {
            return true;
        }
        return false;
    }
    public int peek() throws Custom_Exception {
        if(isEmpty())
        {
            throw new Custom_Exception("Not valid");
        }
        return data[ptr];
    }
    public int pop() throws Custom_Exception {
//        if(isEmpty())
//        {
//            throw new Exception("Stack is Empty");  //if this was used throws Exception
//        }

        if(isEmpty())
        {
            throw new Custom_Exception("Not valid");
        }
//        int remove=data[ptr];
//        ptr--;
//        return remove;
        return data[ptr--];
    }

}
class Custom_Exception extends Exception{
    public Custom_Exception(String message) {
        super(message);
    }
}