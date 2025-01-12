package OOPS.Interfaces.Nested_Interfaces;

public class A {

    public interface NestedInterface
    {
        void fun();
    }
}

 class B implements A.NestedInterface{

    @Override
    public void fun() {
        System.out.println("i am having fun coding");
    }
}

class Main{
    public static void main(String[] args) {
        B obj=new B();
        obj.fun();
    }
}