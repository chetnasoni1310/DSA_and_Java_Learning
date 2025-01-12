package OOPS.Generics;

import java.util.Arrays;

public class CustomGENERICSArrayList<T> {

    private Object[] data;
    private int DEFAULT_SIZE=10;
    private int size=0;

    public CustomGENERICSArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num)
    {
        if(isFull())
        {
            resize();

        }
        data[size++]=num;
    }

    private boolean isFull() {
        return size==data.length;
    }

    private void resize() {
        Object[] temp=new Object[data.length *2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public T remove()
    {
        T removed= (T) data[--size];
        return removed;
    }

    public T get(int index)
    {
        return (T)data[index];
    }
    public int size()
    {
        return size;
    }
    public void set(int index,T value)
    {
          data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGENERICSArrayList<Integer> list=new CustomGENERICSArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);

        System.out.println(list.remove());
        list.set(0,45);
        System.out.println(list.get(5));
        System.out.println(list.size());

    }


}
