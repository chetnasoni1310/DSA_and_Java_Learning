package OOPS.Interfaces.InterfacesExtendsEachOther;

public class Main implements B{
    public static void main(String[] args) {

    }

    @Override
    public void greet() {
        System.out.println("Hi nice to meet you");

    }

    @Override
    public void fun() {
        System.out.println("Have fun coding");
    }
}
