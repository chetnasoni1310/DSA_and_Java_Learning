package OOPS.Interfaces.InterfacesExtend_Default.InterfacesExtendsEachOther;

public class Main implements B,A {
    public static void main(String[] args) {
          Main obj=new Main();

          A.Yooyo();
    }

    @Override
    public void greet() {
        System.out.println("Hi nice to meet you");

    }

//    @Override
//    public void fun() {
//        System.out.println("Have fun coding");
//    }
    //Not giving errror even we are not implementing this in Main class because fun is default in A

}
